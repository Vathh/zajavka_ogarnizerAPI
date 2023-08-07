package pl.ogarnizer.infrastructure.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ogarnizer.infrastructure.database.entity.AwayWorkEntity;

@Repository
public interface AwayWorkRepository extends JpaRepository<AwayWorkEntity, Integer> {
}
