package com.example.BP1.estudiante.infraestructure.controller.controllers;

import com.example.BP1.estudiante.application.serviceImpl.FindAllStudentsImpl;
import com.example.BP1.estudiante.application.serviceImpl.FindStudentByIdServiceImpl;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class FindAllStudentsController {

    @Autowired
    FindAllStudentsImpl findAllStudentsService;
    @Autowired
    FindStudentByIdServiceImpl findByIdServiceImpl;

    @GetMapping("/estudiantes/all")
    public ResponseEntity<List<EstudianteOutputDTO>> getAllStudents(){
        return new ResponseEntity<>(findAllStudentsService
                .getAllStudents()
                .stream()
                .map(EstudianteOutputDTO::new)
                .toList(), HttpStatus.ACCEPTED);
    }
    @GetMapping("/estudiantes/find/{id}")
    public ResponseEntity<EstudianteOutputDTO> findPersonById(@PathVariable String id) throws Exception {
        return new ResponseEntity<>(new EstudianteOutputDTO(findByIdServiceImpl.findStudentById(id)), HttpStatus.ACCEPTED);
    }
}
