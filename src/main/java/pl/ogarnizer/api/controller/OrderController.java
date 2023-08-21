package pl.ogarnizer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ogarnizer.api.dto.OrderDTO;
import pl.ogarnizer.api.mapper.OrderMapper;
import pl.ogarnizer.infrastructure.configuration.RandomDataService;
import pl.ogarnizer.infrastructure.database.repository.ClientRepository;
import pl.ogarnizer.infrastructure.database.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping(OrderController.ORDER)
public class OrderController {

    public static final String ORDER = "/order";
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private RandomDataService randomDataService;
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping
    public List<OrderDTO> orderList(){
        orderRepository.deleteAll();
        clientRepository.deleteAll();

        randomDataService.saveClients();
        randomDataService.saveRandomOrders();

        return orderRepository.findAll().stream()
                .map(orderMapper::map)
                .toList();
    }
}
