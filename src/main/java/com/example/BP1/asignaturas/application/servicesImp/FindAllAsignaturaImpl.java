package com.example.BP1.asignaturas.application.servicesImp;

import com.example.BP1.asignaturas.application.services.FindAllAsignaturaService;
import com.example.BP1.asignaturas.domain.Asignatura;
import com.example.BP1.asignaturas.infraestructure.repository.AsignaturasRepositorio;
import com.example.BP1.profesor.application.services.FindAllProfesorService;
import com.example.BP1.profesor.domain.Profesor;
import com.example.BP1.profesor.infraestructure.repository.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindAllAsignaturaImpl implements FindAllAsignaturaService {

    @Autowired
    AsignaturasRepositorio asignaturasRepositorio;


    @Override
    public List<Asignatura> getAllAsignaturas() {
        List<Asignatura> asignaturas =  asignaturasRepositorio.findAll();

        return asignaturas;
    }
}
