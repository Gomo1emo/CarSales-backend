package repository;

import entity.cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface carRepo extends JpaRepository<cars, Long> {
}
