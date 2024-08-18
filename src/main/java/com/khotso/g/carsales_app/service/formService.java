package com.khotso.g.carsales_app.service;

import com.khotso.g.carsales_app.entity.forms;

import java.util.List;

public interface formService {

    List<forms> getAllForms();

    void saveForms(forms Forms);
    void upDateForm(Long id, forms Forms);
    forms getFormById(Long id);
    void deleteForm(Long id);
}
