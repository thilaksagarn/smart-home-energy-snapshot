package com.example.energy.repository;

import com.example.energy.model.EnergyUsage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnergyUsageRepository extends JpaRepository<EnergyUsage, Long> {
    List<EnergyUsage> findByApplianceId(Long applianceId); // Ensure this matches the field name
}