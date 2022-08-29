package com.example.BP1.asignaturas.application.services;

import com.example.BP1.asignaturas.domain.Asignatura;
import com.example.BP1.profesor.domain.Profesor;

import java.util.List;


public interface FindAsignaturaByIdService {
    Asignatura findAsignaturaById(int id) throws Exception;

    List<Asignatura> findAsignaturaByStudent(int id) throws Exception;

}
