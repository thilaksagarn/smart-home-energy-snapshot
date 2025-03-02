package com.example.energy.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class EnergyUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String applianceName;
    private double energyConsumed;
    private Long applianceId;

    @Column(nullable = false) // Ensure this matches the database schema
    private LocalDateTime timestamp; // Add this field

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplianceName() {
        return applianceName;
    }

    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

    public double getEnergyConsumed() {
        return energyConsumed;
    }

    public void setEnergyConsumed(double energyConsumed) {
        this.energyConsumed = energyConsumed;
    }

    public Long getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(Long applianceId) {
        this.applianceId = applianceId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}