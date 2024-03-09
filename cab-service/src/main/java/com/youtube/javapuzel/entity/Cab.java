package com.youtube.javapuzel.entity;

import common.dtos.cab.enums.cabs.CabType;
import common.dtos.enums.CommonStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Builder
public class Cab {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cabId")
    private UUID cabId;

    @Column(name = "driverID")
    private UUID driverId;

    @Column(name = "registrationNumber")
    private String registrationNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "cabType")
    private CabType cabType;

    @Enumerated(EnumType.STRING)
    @Column(name = "cab_status")
    private CommonStatus driverStatus;

}
