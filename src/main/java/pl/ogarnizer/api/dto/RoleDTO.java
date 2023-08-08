package pl.ogarnizer.api.dto;

import lombok.*;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {
    private Integer roleId;
    private String role;
}
