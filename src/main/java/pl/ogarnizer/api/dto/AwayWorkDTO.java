package pl.ogarnizer.api.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AwayWorkDTO {

    private Integer awayWorkId;
    private UserDTO creatingUser;
    private LocalDateTime createdDate;
    private PriorityDTO priority;
    private ClientDTO client;
    private String description;
    private String place;
    private String device;
    private String additionalInfo;
    private String updateInfo;
    private StageDTO stage;
}
