package pl.ogarnizer.infrastructure.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ogarnizer.infrastructure.database.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
