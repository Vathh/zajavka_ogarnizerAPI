package pl.ogarnizer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ogarnizer.api.dto.AwayWorksDTO;
import pl.ogarnizer.api.mapper.AwayWorkMapper;
import pl.ogarnizer.infrastructure.database.repository.AwayWorkRepository;

@RestController
@RequestMapping(AwayWorkController.AWAY_WORK)
public class AwayWorkController {

    public static final String AWAY_WORK = "/away_work";
    @Autowired
    private AwayWorkRepository awayWorkRepository;
    @Autowired
    private AwayWorkMapper awayWorkMapper;

    @GetMapping
    public AwayWorksDTO awayWorksList(){
        return AwayWorksDTO.of(awayWorkRepository.findAll().stream()
                .map(awayWorkMapper::map)
                .toList());
    }
}
