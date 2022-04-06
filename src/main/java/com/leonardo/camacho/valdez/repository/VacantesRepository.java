package com.leonardo.camacho.valdez.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.camacho.valdez.model.Vacante;

public interface VacantesRepository extends JpaRepository<Vacante, Integer> {

}
