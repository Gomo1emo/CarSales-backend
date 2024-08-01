package service;

import entity.cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.carRepo;

import java.util.List;
import java.util.Optional;

@Service
public class carServiceImp implements carServive {

    @Autowired
    private carRepo CarRepo;

    @Override
    public List<cars> getAllCars() {

        return CarRepo.findAll();
    }

    @Override
    public void saveCars(cars Cars) {

        this.CarRepo.save(Cars);
    }

    @Override
    public void upDateCar(Long id, cars Cars) {

        cars CarsFromDb = CarRepo.findById(id).get();
        CarsFromDb.setImage1(Cars.getImage1());
        CarsFromDb.setImage2(Cars.getImage2());
        CarsFromDb.setImage3(Cars.getImage3());
        CarsFromDb.setImage4(Cars.getImage4());
        CarsFromDb.setImage5(Cars.getImage5());
        CarsFromDb.setImage6(Cars.getImage6());
        CarsFromDb.setBody(Cars.getBody());
        CarsFromDb.setYear(Cars.getYear());
        CarsFromDb.setMake(Cars.getMake());
        CarsFromDb.setMilage(Cars.getMilage());
        CarsFromDb.setModel(Cars.getModel());
        CarsFromDb.setColor(Cars.getColor());
        CarsFromDb.setVin(Cars.getVin());
        CarsFromDb.setDesc(Cars.getDesc());
        CarsFromDb.setDrive(Cars.getDrive());
        CarsFromDb.setFuel(Cars.getFuel());
        CarsFromDb.setTransmission(Cars.getTransmission());
        CarsFromDb.setPrice(Cars.getPrice());
        CarRepo.save(CarsFromDb);

    }

    @Override
    public cars getCarById(Long id) {

        Optional<cars> optional = CarRepo.findById(id);
        cars Cars;
        if (optional.isPresent()) {
            Cars = optional.get();
        } else {
            throw new RuntimeException("cars for the id: " + id + " is not found!");
        }

        return Cars;
    }

    @Override
    public void deleteCar(Long id) {

        this.CarRepo.deleteById(id);
    }


    }
