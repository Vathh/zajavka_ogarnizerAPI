package pl.ogarnizer.infrastructure.configuration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.ogarnizer.infrastructure.database.entity.*;
import pl.ogarnizer.infrastructure.database.repository.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class RandomDataService {

    private final UserRepository userRepository;
    private final PriorityRepository priorityRepository;
    private final ClientRepository clientRepository;
    private final StageRepository stageRepository;
    private final AwayWorkRepository awayWorkRepository;
    private final OrderRepository orderRepository;
    private final ServiceRepository serviceRepository;
    @Transactional
    public void saveClients(){
        clientRepository.saveAll(getClients());
    }
    @Transactional
    public void saveRandomData(){
        awayWorkRepository.saveAll(getAwayWorks());
        orderRepository.saveAll(getOrders());
        serviceRepository.saveAll(getServices());
    }

    @Transactional
    public void saveRandomAwayWorks(){
        awayWorkRepository.saveAll(getAwayWorks());
    }

    @Transactional
    public void saveRandomOrders(){
        orderRepository.saveAll(getOrders());
    }

    @Transactional
    public void saveRandomServices(){
        serviceRepository.saveAll(getServices());
    }

    public List<AwayWorkEntity> getAwayWorks(){
        List<AwayWorkEntity> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            AwayWorkEntity awayWorkEntity = AwayWorkEntity.builder()
                    .creatingUser(getRandomUser())
                    .createdDate(getRandomDateTime())
                    .priority(getRandomPriority())
                    .client(getRandomClient(i))
                    .description(getRandomDescription())
                    .place(getRandomPlace())
                    .device(getRandomDevice())
                    .additionalInfo(getRandomAdditionalInfo())
                    .stage(getRandomStage())
                    .build();
            list.add(awayWorkEntity);
        }
        return list;
    }

    public List<OrderEntity> getOrders(){
        List<OrderEntity> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            OrderEntity orderEntity = OrderEntity.builder()
                    .creatingUser(getRandomUser())
                    .createdDate(getRandomDateTime())
                    .priority(getRandomPriority())
                    .client(getRandomClient(i))
                    .description(getRandomDescription())
                    .device(getRandomDevice())
                    .additionalInfo(getRandomAdditionalInfo())
                    .stage(getRandomStage())
                    .build();
            list.add(orderEntity);
        }
        return list;
    }

    public List<ServiceEntity> getServices(){
        List<ServiceEntity> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            ServiceEntity serviceEntity = ServiceEntity.builder()
                    .creatingUser(getRandomUser())
                    .createdDate(getRandomDateTime())
                    .priority(getRandomPriority())
                    .client(getRandomClient(i))
                    .description(getRandomDescription())
                    .device(getRandomDevice())
                    .additionalInfo(getRandomAdditionalInfo())
                    .stage(getRandomStage())
                    .build();
            list.add(serviceEntity);
        }
        return list;
    }

    public List<ClientEntity> getClients(){
        List<ClientEntity> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            ClientEntity clientEntity = ClientEntity.builder()
                    .name(getRandomAlphabeticString())
                    .address(getRandomAddress())
                    .nip(getRandomNIP())
                    .phoneNumber(getRandomPhoneNumber())
                    .build();
            list.add(clientEntity);
        }
        return list;
    }

    private ClientEntity getRandomClient(int i){
        List<ClientEntity> clientEntities = clientRepository.findAll();
        return clientEntities.get(i);
    }

    private StageEntity getRandomStage() {
        List<StageEntity> stageEntities = stageRepository.findAll();
        return stageEntities.get(getRandomNumber(0, stageEntities.size()));
    }

    private UserEntity getRandomUser(){
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.get(getRandomNumber(0, userEntities.size()));
    }

    private LocalDateTime getRandomDateTime(){
        return LocalDateTime.of(
                getRandomNumber(2000, 2023),
                getRandomNumber(1,12),
                getRandomNumber(1,25),
                getRandomNumber(1,24),
                getRandomNumber(0,59),
                getRandomNumber(0,59)
        );
    }

    private PriorityEntity getRandomPriority(){
        List<PriorityEntity> priorityEntities = priorityRepository.findAll();
        return priorityEntities.get(getRandomNumber(0, priorityEntities.size()));
    }

    private String getRandomDescription(){
        List<String> descriptions = List.of(
            "procesor do laptopa",              "piec uzywany",
                "rolka poboru papieru",                 "folia do pieca",
                "toner + beben",                        "zuzyta rolka poboru papieru",
                "zuzyty zolty beben",                   "brudzi na czarno",
                "zaciecie w strefie bocznych drzwiczek","nie pobiera papieru",
                "zaciecie papieru",                     "brak zasilania",
                "uszkodzona matryca",                   "uszkodzony wyswietlacz",
                "brudzenie wydruku",                    "brudzi na zolto i czerwono",
                "touchpad nie dziala",                  "brak dzwieku",
                "powolne dzialanie"
        );

        return descriptions.get(getRandomNumber(0, descriptions.size()));
    }

    private String getRandomPlace(){
        List<String> places = List.of(
                "padma 3.0", "biuro na 2 pietrze",
                "biuro w piwnicy", "biuro na 1 pietrze",
                "sekretariat", "magazyn przyjec towaru",
                "produkcja", "biuro na magazynie",
                "biuro na bydgoskiej", "oddzial na noniewicza",
                "biuro na muzycznej"
        );
        return places.get(getRandomNumber(0, places.size()));
    }

    private String getRandomDevice(){
        List<String> devices = List.of(
                "dell latitude 5490", "bizhub 3020",
                "hp 4200", "hp 2035",
                "ricoh mp501", "bizhub c356",
                "bizhub c234", "hp 123",
                "ricoh 9851", "xerox 357",
                "dell latitude 5120", "laptop hp",
                "dell precision tower 8160", "bizhub 3350"
        );
        return devices.get(getRandomNumber(0, devices.size()));
    }

    private String getRandomAdditionalInfo() {
        List<String> additionalInfos = List.of(
                "wymienilem toner", "sprawdzalem karte graficzna",
                "sprawdzalem wydruk kolorowy", "czarny drukuje ok",
                "zacina ze wszystkich szuflad", "reczny podajnik dziala",
                "haslo do kompa: ciasto123", "mozliwe ze uszkodzony czujnik polozenia papieru",
                "czyscilem czujniki", "wszystkie rolki wymienione na nowe"
        );
        return additionalInfos.get(getRandomNumber(0, additionalInfos.size()));
    }

    private String getRandomAddress() {
        List<String> addresses = List.of(
                "Brylantowa 8 Suwalki", "Szafirowa 12 Goldap",
                "Diamentowa 15 Elk", "Rubinowa 8 Olecko",
                "Ametystowa 19 Augustow", "Szmaragdowa 5 Bialystok",
                "Rubinowa 3 Krasnopol", "Polna 12 Bakalarzewo",
                "Polna 3 Wizajny", "Noniewicza 15 Szypliszki",
                "Pilsudskiego 5 Suwalki"
        );
        return addresses.get(getRandomNumber(0, addresses.size()));
    }

    private String getRandomNIP() {
        String nip = "" + getRandomNumber(0,10) + getRandomNumber(0,10) + getRandomNumber(0,10) + " " +
                getRandomNumber(0,10) + getRandomNumber(0,10) + getRandomNumber(0,10) + " " +
                getRandomNumber(0,10) + getRandomNumber(0,10) + " " +
                getRandomNumber(0,10) + getRandomNumber(0,10);
        return nip;
    }

    private String getRandomPhoneNumber() {
        List<String> numbers = List.of(
                "512 233 135","111 333 222",
                "753 753 753","951 951 951",
                "953 375 359", "156 654 798",
                "158 487 981", "587 456 982"
        );
        return numbers.get(getRandomNumber(0, numbers.size()));
    }


    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String getRandomAlphabeticString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
