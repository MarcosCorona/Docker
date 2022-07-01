package com.example.BP1.persona.application.serviceImpl;

import com.example.BP1.persona.application.services.FindByNameService;
import com.example.BP1.persona.infraestructure.repository.PersonaRepositorio;
import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindByNameServiceImpl implements FindByNameService {
    @Autowired
    PersonaRepositorio personaRepositorio;
    @Override
    public List<PersonaOutputDTO> findPersonsByName(String name) {
        List<PersonaOutputDTO> personas = personaRepositorio.findByName(name);
        return personas;
    }
}
