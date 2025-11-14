package com.jupitters.universalpetcare.repository;

import com.jupitters.universalpetcare.model.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarianRepository extends JpaRepository<Veterinarian,Long> {
}
