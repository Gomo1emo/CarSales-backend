package com.khotso.g.carsales_app.repository;

import com.khotso.g.carsales_app.entity.cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface carRepo extends JpaRepository<cars, Long> {
}
