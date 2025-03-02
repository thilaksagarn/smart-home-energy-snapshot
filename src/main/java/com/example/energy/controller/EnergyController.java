package com.example.energy.controller;

import com.example.energy.model.EnergyUsage;
import com.example.energy.repository.EnergyUsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/energy")
public class EnergyController {

    @Autowired
    private EnergyUsageRepository energyUsageRepository;

    @GetMapping
    public List<EnergyUsage> getAllEnergyUsage() {
        return energyUsageRepository.findAll();
    }
    @PutMapping("/{id}")
    public ResponseEntity<EnergyUsage> updateEnergyUsage(@PathVariable Long id, @RequestBody EnergyUsage energyUsage) {
        EnergyUsage existingUsage;
        existingUsage = energyUsageRepository.findById(id)
                .orElseThrow();

        existingUsage.setApplianceId(energyUsage.getApplianceId());
        existingUsage.setApplianceName(energyUsage.getApplianceName());
        existingUsage.setEnergyConsumed(energyUsage.getEnergyConsumed());
        existingUsage.setTimestamp(energyUsage.getTimestamp());

        EnergyUsage updatedUsage = energyUsageRepository.save(existingUsage);
        return ResponseEntity.ok(updatedUsage);
    }
    @PostMapping
    public ResponseEntity<EnergyUsage> createEnergyUsage(@RequestBody EnergyUsage energyUsage) {
        // Ensure the timestamp is set
        if (energyUsage.getTimestamp() == null) {
            energyUsage.setTimestamp(LocalDateTime.now()); // Set current timestamp
        }

        EnergyUsage savedUsage = energyUsageRepository.save(energyUsage);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUsage);
    }
}