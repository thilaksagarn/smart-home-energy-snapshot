package com.example.energy.service;

import com.example.energy.model.EnergyUsage;
import com.example.energy.repository.EnergyUsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EnergyService {

    @Autowired
    private EnergyUsageRepository energyUsageRepository;

    @Scheduled(fixedRate = 60000) // Run every minute
    public void simulateEnergyData() {
        EnergyUsage energyUsage = new EnergyUsage();
        energyUsage.setApplianceId(1L); // Simulate data for appliance with ID 1
        energyUsage.setTimestamp(LocalDateTime.now());
        energyUsage.setEnergyConsumed(Math.random() * 10); // Random energy usage
        energyUsageRepository.save(energyUsage);
    }
}