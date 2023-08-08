package pl.ogarnizer.api.dto;

import lombok.*;

import java.util.List;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class OrdersDTO {
    private List<OrderDTO> orders;
}
