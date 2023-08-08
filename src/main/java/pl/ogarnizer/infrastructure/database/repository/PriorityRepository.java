package pl.ogarnizer.infrastructure.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ogarnizer.infrastructure.database.entity.PriorityEntity;

import java.util.Optional;

public interface PriorityRepository extends JpaRepository<PriorityEntity, Integer> {

    Optional<PriorityEntity> findByName(String name);
}
