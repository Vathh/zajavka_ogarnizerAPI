package pl.ogarnizer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ogarnizer.api.dto.AwayWorkDTO;
import pl.ogarnizer.api.mapper.AwayWorkMapper;
import pl.ogarnizer.infrastructure.configuration.RandomDataService;
import pl.ogarnizer.infrastructure.database.repository.AwayWorkRepository;
import pl.ogarnizer.infrastructure.database.repository.ClientRepository;

import java.util.List;

@RestController
@RequestMapping(AwayWorkController.AWAY_WORK)
public class AwayWorkController {

    public static final String AWAY_WORK = "/away_work";
    @Autowired
    private AwayWorkRepository awayWorkRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private RandomDataService randomDataService;
    @Autowired
    private AwayWorkMapper awayWorkMapper;

    @GetMapping
    public List<AwayWorkDTO> awayWorksList(){
        awayWorkRepository.deleteAll();
        clientRepository.deleteAll();

        randomDataService.saveClients();
        randomDataService.saveRandomAwayWorks();

        return awayWorkRepository.findAll().stream()
                .map(awayWorkMapper::map)
                .toList();
    }
}
