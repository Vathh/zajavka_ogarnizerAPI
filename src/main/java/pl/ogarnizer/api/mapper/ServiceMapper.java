package pl.ogarnizer.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.ogarnizer.api.dto.ServiceDTO;
import pl.ogarnizer.infrastructure.database.entity.ServiceEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServiceMapper {
    ServiceDTO map(ServiceEntity serviceEntity);
}
