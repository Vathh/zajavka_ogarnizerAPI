package pl.ogarnizer.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.ogarnizer.api.dto.StageDTO;
import pl.ogarnizer.infrastructure.database.entity.StageEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StageMapper {
    StageDTO map(StageEntity stageEntity);
}
