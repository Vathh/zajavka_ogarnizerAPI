package pl.ogarnizer.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AwayWorkDTO {
    private UserDTO creatingUser;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
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
