package com.example.BP1.persona.infraestructure.repository.controller.controllers;

import com.example.BP1.persona.application.serviceImpl.FindByIdServiceImpl;
import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class FindPersonaByIdController {
    @Autowired
    FindByIdServiceImpl findByIdServiceImplService;

    @GetMapping("{id}")
    public ResponseEntity<PersonaOutputDTO> findPersonById(@PathVariable Integer id) throws Exception {
        return new ResponseEntity<>(new PersonaOutputDTO(findByIdServiceImplService.findPersonById(id)), HttpStatus.ACCEPTED);
    }
}