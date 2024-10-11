package com.project.uber.uberApp.dto;

import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.entities.Rider;
import com.project.uber.uberApp.entities.enums.PaymentMethod;
import com.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {

    private Long Id;

    private Point pickupLocation;

    private Point dropLocation;

    private LocalDateTime createdTime;

    private DriverDto driver;

    private Rider rider;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
