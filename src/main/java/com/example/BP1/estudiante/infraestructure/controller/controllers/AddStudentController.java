package com.example.BP1.estudiante.infraestructure.controller.controllers;

import com.example.BP1.estudiante.application.serviceImpl.AddEstudianteServiceImpl;
import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AddStudentController {

    @Autowired
    AddEstudianteServiceImpl addEstudianteService;

    @PostMapping("/estudiante")
    public ResponseEntity<EstudianteOutputDTO> addStudent(@RequestBody EstudianteInputDTO estudianteInputDTO) throws Exception {
        return new ResponseEntity<>(new EstudianteOutputDTO(addEstudianteService.addEstudiante(estudianteInputDTO)), HttpStatus.OK);
    }
}
