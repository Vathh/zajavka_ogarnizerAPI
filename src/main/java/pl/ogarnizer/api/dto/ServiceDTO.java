package pl.ogarnizer.api.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDTO {
    private Integer serviceId;
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
