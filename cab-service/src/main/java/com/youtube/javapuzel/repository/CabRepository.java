package com.youtube.javapuzel.repository;

import com.youtube.javapuzel.entity.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CabRepository extends JpaRepository<Cab, UUID> {
}
