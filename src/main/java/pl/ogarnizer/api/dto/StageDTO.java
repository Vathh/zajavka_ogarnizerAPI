package pl.ogarnizer.api.dto;

import lombok.*;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StageDTO {
    Integer stageId;
    String name;
}
