package pl.ogarnizer.api.dto;

import lombok.*;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriorityDTO {
    Integer priorityId;
    String name;
}
