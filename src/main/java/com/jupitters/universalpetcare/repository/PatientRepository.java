package com.jupitters.universalpetcare.repository;

import com.jupitters.universalpetcare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
