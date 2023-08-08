package pl.ogarnizer.api.dto;

import lombok.*;

import java.util.List;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class ClientsDTO {
    private List<ClientDTO> clients;
}
