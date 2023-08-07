package pl.ogarnizer.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.ogarnizer.api.dto.AwayWorkDTO;
import pl.ogarnizer.infrastructure.database.entity.AwayWorkEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AwayWorkMapper {
    AwayWorkDTO map(AwayWorkEntity awayWorkEntity);
}
