package com.example.motoservice.models.dao;

import com.example.motoservice.models.entity.Motorcycle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IMotorcycleDao extends CrudRepository<Motorcycle, Long> {
}
