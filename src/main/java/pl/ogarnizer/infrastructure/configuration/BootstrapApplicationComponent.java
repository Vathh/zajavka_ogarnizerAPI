package pl.ogarnizer.infrastructure.configuration;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.ogarnizer.infrastructure.database.repository.AwayWorkRepository;
import pl.ogarnizer.infrastructure.database.repository.ClientRepository;
import pl.ogarnizer.infrastructure.database.repository.OrderRepository;
import pl.ogarnizer.infrastructure.database.repository.ServiceRepository;

@Slf4j
@Component
@AllArgsConstructor
public class BootstrapApplicationComponent implements ApplicationListener<ContextRefreshedEvent> {

    private AwayWorkRepository awayWorkRepository;
    private ClientRepository clientRepository;
    private OrderRepository orderRepository;
    private ServiceRepository serviceRepository;
    private RandomDataService randomDataService;

    @Override
    public void onApplicationEvent(@NonNull ContextRefreshedEvent event) {
        awayWorkRepository.deleteAll();
        clientRepository.deleteAll();
        orderRepository.deleteAll();
        serviceRepository.deleteAll();

        randomDataService.saveClients();
        randomDataService.saveRandomData();
    }
}
