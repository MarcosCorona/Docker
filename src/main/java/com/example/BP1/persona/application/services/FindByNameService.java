package com.example.BP1.persona.application.services;

import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;

import java.util.List;

public interface FindByNameService {

    List<PersonaOutputDTO> findPersonsByName(String usuario);
}
