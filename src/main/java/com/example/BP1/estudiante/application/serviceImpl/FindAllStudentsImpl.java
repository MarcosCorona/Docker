package com.example.BP1.estudiante.application.serviceImpl;

import com.example.BP1.estudiante.application.services.FindAllStudentsService;
import com.example.BP1.profesor.application.services.FindAllProfesorService;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.estudiante.infraestructure.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindAllStudentsImpl implements FindAllStudentsService {

    @Autowired
    EstudianteRepositorio estudianteRepositorio;


    @Override
    public List<Estudiante> getAllStudents() {
        List<Estudiante> estudiantes =  estudianteRepositorio.findAll();

        return estudiantes;
    }
}
