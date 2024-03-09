package com.youtube.javapuzel.controller;

import com.youtube.javapuzel.entity.Cab;
import com.youtube.javapuzel.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/cab")
public class CabController {

    @Autowired
    private CabService cabService;

    @GetMapping
    public List<Cab> getAllCabs(){
       return cabService.getAllCabs();
    }

    @PostMapping
    public Cab saveCab(@RequestBody Cab cab){
        return cabService.saveCab(cab);
    }

    @GetMapping("/{cabId}")
    public Optional<Cab> getById(@PathVariable UUID cabId){
      return cabService.getById(cabId);
    }


    @DeleteMapping("/delete/{cabId}")
    public void deleteCab(@PathVariable UUID cabId){
         cabService.deleteCab(cabId);
    }

}
