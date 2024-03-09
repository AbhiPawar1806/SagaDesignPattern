package com.youtube.javapuzel.entity;

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
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "driverID")
    private UUID driverId;
    @Column(name = "driverName")
    private String driverName;
    @Column(name = "driverEmail")
    private String driverEmail;
    @Column(name = "driverLocation")
    private String driverLocation;
    @Column(name = "driver_status")
    private CommonStatus driverStatus;

}
