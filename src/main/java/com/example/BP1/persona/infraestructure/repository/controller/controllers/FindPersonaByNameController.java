package com.example.BP1.persona.infraestructure.repository.controller.controllers;

import com.example.BP1.persona.application.serviceImpl.FindByNameServiceImpl;
import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class FindPersonaByNameController {
    @Autowired
    FindByNameServiceImpl findByNameService;

    @GetMapping("/find/{name}")
    public List<PersonaOutputDTO> findPersonByName(@PathVariable String name) throws Exception {
        List<PersonaOutputDTO> output = findByNameService.findPersonsByName(name);
        return output;
    }
}