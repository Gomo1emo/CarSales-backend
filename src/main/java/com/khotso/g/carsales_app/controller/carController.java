package com.khotso.g.carsales_app.controller;


import com.khotso.g.carsales_app.entity.cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import com.khotso.g.carsales_app.service.carServive;

@RestController
@RequestMapping("/api/Cars")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class carController {

    @Autowired
    private carServive CarService;

    @GetMapping
    public List<cars> findAll(){
        return CarService.getAllCars();
    }

    @PostMapping
    public void save(@RequestBody cars Cars){
        CarService.saveCars(Cars);
    }

    @GetMapping("/{id}")
    public cars findOne(@PathVariable Long id){
        return CarService.getCarById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody cars Cars){
        this.CarService.upDateCar(id,Cars);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.CarService.deleteCar(id);
    }
}
