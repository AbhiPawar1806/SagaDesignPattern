package com.youtube.javapuzel.controller;

import com.youtube.javapuzel.entity.Driver;
import com.youtube.javapuzel.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;

    // Method to save the driver in DB
    @PostMapping()
    public Driver saveDriver(@RequestBody Driver driver){
        return driverService.saveDriver(driver);
    }

    // Get All Drivers
    @GetMapping
    public List<Driver> getAllDrivers(){
       return  driverService.getAllDriver();
    }

    @GetMapping("/{driverId}")
    public Optional<Driver> getByID(@PathVariable UUID driverId){
        return driverService.getByID(driverId);
    }
}
