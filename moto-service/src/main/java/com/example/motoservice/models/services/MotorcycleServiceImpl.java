package com.example.motoservice.models.services;

import com.example.motoservice.models.dao.IMotorcycleDao;
import com.example.motoservice.models.entity.Motorcycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MotorcycleServiceImpl implements IMotorcycleService {

    @Autowired
    private IMotorcycleDao motorcycleDao;

    @Override
    @Transactional(readOnly = true)
    public List<Motorcycle> findAll() {
        return (List<Motorcycle>) motorcycleDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Motorcycle findById(Long id) {
        return motorcycleDao.findById(id).orElse(null);
    }

}
