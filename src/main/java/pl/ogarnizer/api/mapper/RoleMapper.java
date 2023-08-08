package pl.ogarnizer.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.ogarnizer.api.dto.RoleDTO;
import pl.ogarnizer.infrastructure.database.entity.RoleEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper {
    RoleDTO map(RoleEntity roleEntity);
}
