package com.example.BP1.profesor.application.serviceImpl;

import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;
import com.example.BP1.profesor.application.services.FindProfesorByIdService;
import com.example.BP1.profesor.domain.Profesor;
import com.example.BP1.profesor.infraestructure.repository.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindProfesorByIdServiceImpl implements FindProfesorByIdService {

    @Autowired
    ProfesorRepositorio profesorRepositorio;

    @Override
    public Profesor findProfesorById(int id) throws Exception {

        return profesorRepositorio.findById(id).orElseThrow(() -> new NotFoundException404("No se encontró el id del profesor"));

    }
}
