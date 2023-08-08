package pl.ogarnizer.infrastructure.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ogarnizer.infrastructure.database.entity.StageEntity;

import java.util.Optional;

public interface StageRepository extends JpaRepository<StageEntity, Integer> {

    Optional<StageEntity> findByName(String name);
}
