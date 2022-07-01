package com.example.BP1.profesor.application.serviceImpl;

import com.example.BP1.profesor.application.services.FindAllProfesorService;
import com.example.BP1.profesor.domain.Profesor;
import com.example.BP1.profesor.infraestructure.repository.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindAllProfesorImpl implements FindAllProfesorService {

    @Autowired
    ProfesorRepositorio profesorRepositorio;


    @Override
    public List<Profesor> getAllProfesors() {
        List<Profesor> profesors =  profesorRepositorio.findAll();

        return profesors;
    }
}
