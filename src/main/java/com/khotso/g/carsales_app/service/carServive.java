package com.khotso.g.carsales_app.service;

import com.khotso.g.carsales_app.entity.cars;

import java.util.List;

public interface carServive {

    List<cars> getAllCars();

    void saveCars(cars Cars);
    void upDateCar(Long id, cars Cars);
    cars getCarById(Long id);
    void deleteCar(Long id);
}
