package com.example.BP1.persona.infraestructure.repository.controller.controllers;

import com.example.BP1.persona.application.serviceImpl.FindAllPersonsServiceImpl;
import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class FindAllController {

    @Autowired
    FindAllPersonsServiceImpl findAllPersonsService;


    @GetMapping("/findall")
    public ResponseEntity<List<PersonaOutputDTO>> getAllPersons(){
        return new ResponseEntity<>(findAllPersonsService
                .getAllPersons()
                .stream()
                .map(PersonaOutputDTO::new)
                .toList(), HttpStatus.ACCEPTED);
    }
}
