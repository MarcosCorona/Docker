package com.example.BP1.persona.application.serviceImpl;

import com.example.BP1.persona.application.services.FindByIdService;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;
import com.example.BP1.persona.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindByIdServiceImpl implements FindByIdService {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Override
    public Persona findPersonById(int id) throws Exception {

        return personaRepositorio.findById(id).orElseThrow(() -> new NotFoundException404("No se encontró el id"));

    }
}
