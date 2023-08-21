package pl.ogarnizer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ogarnizer.api.dto.ServiceDTO;
import pl.ogarnizer.api.mapper.ServiceMapper;
import pl.ogarnizer.infrastructure.configuration.RandomDataService;
import pl.ogarnizer.infrastructure.database.repository.ClientRepository;
import pl.ogarnizer.infrastructure.database.repository.ServiceRepository;

import java.util.List;

@RestController
@RequestMapping(ServiceController.SERVICE)
public class ServiceController {

    public static final String SERVICE = "/service";
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private RandomDataService randomDataService;
    @Autowired
    private ServiceMapper serviceMapper;

    @GetMapping
    public List<ServiceDTO> serviceList(){
        serviceRepository.deleteAll();
        clientRepository.deleteAll();

        randomDataService.saveClients();
        randomDataService.saveRandomServices();

        return serviceRepository.findAll().stream()
                .map(serviceMapper::map)
                .toList();
    }
}
