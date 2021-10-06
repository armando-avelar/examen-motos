package com.example.motoservice.controllers;

import com.example.motoservice.models.services.IMotorcycleService;
import com.example.motoservice.models.entity.Motorcycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CotizadorResController {

    @Autowired
    private IMotorcycleService motorcycleService;

    @GetMapping("/motorcycles")
    public List<Motorcycle> index(){
        return motorcycleService.findAll();
    }

    @GetMapping("/motorcycles/{id}")
    public Motorcycle cotizar(@Valid @PathVariable Long id, BindingResult result){
        return motorcycleService.findById(id);
    }

}
