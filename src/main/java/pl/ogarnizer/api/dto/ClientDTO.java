package pl.ogarnizer.api.dto;

import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.Length;

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
