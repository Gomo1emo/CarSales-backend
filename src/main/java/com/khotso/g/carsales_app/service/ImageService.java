package com.khotso.g.carsales_app.service;

import com.khotso.g.carsales_app.entity.Image;
import com.khotso.g.carsales_app.repository.ImageRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImageService {
    @Autowired
    ImageRepo imageRepository;

    public List<Image> list(){
        return imageRepository.findByOrderById();
    }

    public Optional<Image> getOne(int id){
        return imageRepository.findById(id);
    }

    public void save(Image image){
        imageRepository.save(image);
    }

    public void delete(int id){
        imageRepository.deleteById(id);
    }

    public boolean exists(int id){
        return imageRepository.existsById(id);
    }
}
