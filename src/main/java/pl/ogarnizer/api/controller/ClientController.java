package pl.ogarnizer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ogarnizer.api.dto.ClientsDTO;
import pl.ogarnizer.api.mapper.ClientMapper;
import pl.ogarnizer.infrastructure.database.repository.ClientRepository;

@RestController
@RequestMapping(ClientController.CLIENT)
public class ClientController {

    public static final String CLIENT = "/client";
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientMapper clientMapper;

    @GetMapping
    public ClientsDTO awayWorksList(){
        return ClientsDTO.of(clientRepository.findAll().stream()
                .map(clientMapper::map)
                .toList());
    }
}
