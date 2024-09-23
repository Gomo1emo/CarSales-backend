package com.khotso.g.carsales_app.service;

import com.khotso.g.carsales_app.entity.forms;

import com.khotso.g.carsales_app.repository.formsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class formServiceImp implements formService{
    @Autowired
    private formsRepo FormsRepo;

    @Override
    public List<forms> getAllForms() {

        return FormsRepo.findAll();
    }

    @Override
    public void saveForms(forms Forms) {

        this.FormsRepo.save(Forms);
    }

    @Override
    public void upDateForm(Long id, forms Forms) {

        forms FormsFromDb = FormsRepo.findById(id).get();
        FormsFromDb.setDate(Forms.getDate());
        FormsFromDb.setFullNames(Forms.getFullNames());
        FormsFromDb.setPhone(Forms.getPhone());
        FormsFromDb.setEmail(Forms.getEmail());
        FormsFromDb.setTime(Forms.getTime());
        FormsFromDb.setCarModel(Forms.getCarModel());
        FormsFromDb.setAdditionalDetails(Forms.getAdditionalDetails());
        FormsRepo.save(FormsFromDb);

    }

    @Override
    public forms getFormById(Long id) {

        Optional<forms> optional = FormsRepo.findById(id);
        forms Forms;
        if (optional.isPresent()) {
            Forms = optional.get();
        } else {
            throw new RuntimeException("form for the id: " + id + " is not found!");
        }

        return Forms;
    }

    @Override
    public void deleteForm(Long id) {

        this.FormsRepo.deleteById(id);
    }
}
