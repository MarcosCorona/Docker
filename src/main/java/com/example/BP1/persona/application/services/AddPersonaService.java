package com.example.BP1.persona.application.services;

import com.example.BP1.persona.exception.NotFoundException404;
import com.example.BP1.persona.exception.UnprocesableException422;
import com.example.BP1.persona.infraestructure.repository.controller.dto.inputDTO.PersonaInputDTO;
import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;

public interface AddPersonaService {
    PersonaOutputDTO addPersona(PersonaInputDTO persona) throws NotFoundException404;

}