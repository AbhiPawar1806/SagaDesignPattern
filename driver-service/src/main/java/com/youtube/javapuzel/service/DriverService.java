package com.youtube.javapuzel.service;

import com.youtube.javapuzel.entity.Driver;
import com.youtube.javapuzel.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DriverService {
    @Autowired
    private DriverRepository driverRepository;
    public Driver saveDriver(Driver driver) {
       return driverRepository.save(driver);

    }

    public List<Driver> getAllDriver() {
        return driverRepository.findAll();
    }

    public Optional<Driver> getByID(UUID driverId){
        return driverRepository.findById(driverId);

    }
}
