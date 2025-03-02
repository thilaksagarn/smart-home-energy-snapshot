package com.example.energy.repository;

import com.example.energy.model.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplianceRepository extends JpaRepository<Appliance, Long> {
    // Custom query methods can be added here
}