package pl.ogarnizer.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.ogarnizer.api.dto.UserDTO;
import pl.ogarnizer.infrastructure.database.entity.UserEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserDTO map(UserEntity userEntity);
}
