package pl.ogarnizer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ogarnizer.api.dto.ServicesDTO;
import pl.ogarnizer.api.mapper.ServiceMapper;
import pl.ogarnizer.infrastructure.database.repository.ServiceRepository;

@RestController
@RequestMapping(ServiceController.SERVICE)
public class ServiceController {

    public static final String SERVICE = "/service";
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private ServiceMapper serviceMapper;

    @GetMapping
    public ServicesDTO awayWorksList(){
        return ServicesDTO.of(serviceRepository.findAll().stream()
                .map(serviceMapper::map)
                .toList());
    }
}
