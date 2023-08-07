package pl.ogarnizer.infrastructure.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ogarnizer.infrastructure.database.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
