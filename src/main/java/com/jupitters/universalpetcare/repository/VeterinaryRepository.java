package com.jupitters.universalpetcare.repository;

import com.jupitters.universalpetcare.model.Veterinary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinaryRepository extends JpaRepository<Veterinary,Long> {
}
