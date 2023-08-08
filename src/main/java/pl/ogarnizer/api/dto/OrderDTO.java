package pl.ogarnizer.api.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Integer orderId;
    private UserDTO creatingUser;
    private LocalDateTime createdDate;
    private PriorityDTO priority;
    private ClientDTO client;
    private String description;
    private String device;
    private String additionalInfo;
    private String updateInfo;
    private StageDTO stage;
}
