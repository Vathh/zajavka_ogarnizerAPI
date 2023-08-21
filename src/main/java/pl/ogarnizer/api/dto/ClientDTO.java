package pl.ogarnizer.api.dto;

import lombok.*;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    Integer clientId;
    String name;
    String address;
    String nip;
    String phoneNumber;
}
