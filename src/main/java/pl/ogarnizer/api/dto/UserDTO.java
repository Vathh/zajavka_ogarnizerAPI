package pl.ogarnizer.api.dto;

import lombok.*;

import java.util.List;

@Data
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    Integer userId;
    String userName;
    String password;
    List<RoleDTO> roles;
}
