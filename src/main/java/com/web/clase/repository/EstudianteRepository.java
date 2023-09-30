package com.web.clase.repository;

import com.web.clase.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
