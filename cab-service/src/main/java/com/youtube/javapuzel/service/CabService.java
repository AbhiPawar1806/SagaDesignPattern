package com.youtube.javapuzel.service;

import com.youtube.javapuzel.entity.Cab;
import com.youtube.javapuzel.repository.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CabService {
    @Autowired
    private CabRepository cabRepository;
    public List<Cab> getAllCabs() {
      return cabRepository.findAll();
    }

    public Cab saveCab(Cab cab) {
        return cabRepository.save(cab);
    }

    public Optional<Cab> getById(UUID cabId) {
       return cabRepository.findById(cabId);
    }

    public void deleteCab(UUID cabId) {
        cabRepository.deleteById(cabId);
    }
}
