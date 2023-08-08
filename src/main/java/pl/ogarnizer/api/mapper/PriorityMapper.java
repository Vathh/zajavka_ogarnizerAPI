package pl.ogarnizer.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.ogarnizer.api.dto.PriorityDTO;
import pl.ogarnizer.infrastructure.database.entity.PriorityEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PriorityMapper {
    PriorityDTO map(PriorityEntity priorityEntity);
}
