package com.khotso.g.carsales_app.controller;

import com.khotso.g.carsales_app.entity.forms;
import com.khotso.g.carsales_app.service.formService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/testDrive")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class formController {

    @Autowired
    private formService FormService;

    @GetMapping
    public List<forms> findAll(){
        return FormService.getAllForms();
    }

    @PostMapping
    public void save(@RequestBody forms Forms){
        FormService.saveForms(Forms);
    }

    @GetMapping("/{id}")
    public forms findOne(@PathVariable Long id){
        return FormService.getFormById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody forms Forms){
        this.FormService.upDateForm(id,Forms);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.FormService.deleteForm(id);
    }
}
