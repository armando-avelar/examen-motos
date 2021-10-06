package com.example.motoservice.models.services;

import com.example.motoservice.models.entity.Motorcycle;


import java.util.List;

public interface IMotorcycleService {

    public List<Motorcycle> findAll();

    public Motorcycle findById(Long id);
    
}
