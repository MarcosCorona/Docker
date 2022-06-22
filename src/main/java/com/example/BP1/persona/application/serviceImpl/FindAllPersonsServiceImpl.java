package com.example.BP1.persona.application.serviceImpl;

import com.example.BP1.persona.application.services.FindAllPersonsService;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.persona.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindAllPersonsServiceImpl implements FindAllPersonsService {

    @Autowired
    PersonaRepositorio personaRepositorio;


    @Override
    public List<Persona> getAllPersons() {
        List<Persona> personasDTO =  personaRepositorio.findAll();

        return personasDTO;
    }
}
