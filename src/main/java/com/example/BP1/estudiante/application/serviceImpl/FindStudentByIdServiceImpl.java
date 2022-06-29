package com.example.BP1.estudiante.application.serviceImpl;

import com.example.BP1.estudiante.application.services.FindStudentByIdService;
import com.example.BP1.profesor.application.services.FindProfesorByIdService;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.estudiante.infraestructure.repository.EstudianteRepositorio;
import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindStudentByIdServiceImpl implements FindStudentByIdService {

    @Autowired
    EstudianteRepositorio estudianteRepositorio;

    @Override
    public Estudiante findStudentById(String id) throws Exception {

        return estudianteRepositorio.findById(id).orElseThrow(() -> new NotFoundException404("No se encontró el id"));

    }
}
