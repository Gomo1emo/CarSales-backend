package com.khotso.g.carsales_app.repository;

import com.khotso.g.carsales_app.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepo extends JpaRepository<Image, Integer> {
    List<Image> findByOrderById();
}
