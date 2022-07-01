package com.example.BP1.asignaturas.infraestructure.repository;

import com.example.BP1.asignaturas.domain.Asignatura;
import com.example.BP1.profesor.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturasRepositorio extends JpaRepository<Asignatura,Integer> {
}
