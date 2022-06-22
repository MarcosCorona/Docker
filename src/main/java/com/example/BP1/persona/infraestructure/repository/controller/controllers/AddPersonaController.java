package com.example.BP1.persona.infraestructure.repository.controller.controllers;

import com.example.BP1.persona.application.services.AddPersonaService;
import com.example.BP1.persona.exception.NotFoundException404;
import com.example.BP1.persona.infraestructure.repository.controller.dto.inputDTO.PersonaInputDTO;
import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AddPersonaController {

    @Autowired
    AddPersonaService addPersonaService;

    @PostMapping("/add")
    public ResponseEntity<PersonaOutputDTO> addPerson(@RequestBody PersonaInputDTO personaDTO) throws NotFoundException404 {

        return new ResponseEntity<>(new PersonaOutputDTO(addPersonaService.addPersona(personaDTO)), HttpStatus.OK);
    }
}
