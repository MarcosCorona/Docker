package com.example.BP1.profesor.infraestructure.controller.controllers;

import com.example.BP1.profesor.application.serviceImpl.AddProfesorServiceImpl;
import com.example.BP1.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
import com.example.BP1.profesor.infraestructure.controller.dto.output.ProfesorOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AddProfesorController {

    @Autowired
    AddProfesorServiceImpl addProfesorService;

    @PostMapping("/profesor/add")
    public ResponseEntity<ProfesorOutputDTO> addProfesor(@RequestBody ProfesorInputDTO profesorInputDTO) throws Exception {
        return new ResponseEntity<>(new ProfesorOutputDTO(addProfesorService.addProfesor(profesorInputDTO)), HttpStatus.OK);
    }
}
