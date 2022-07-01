package com.example.BP1.profesor.infraestructure.controller.controllers;

import com.example.BP1.profesor.application.serviceImpl.FindAllProfesorImpl;
import com.example.BP1.profesor.application.serviceImpl.FindProfesorByIdServiceImpl;
import com.example.BP1.profesor.infraestructure.controller.dto.output.ProfesorOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class FindAllProfesoresController {

    @Autowired
    FindAllProfesorImpl findAllProfesor;
    @Autowired
    FindProfesorByIdServiceImpl findByIdServiceImpl;

    @GetMapping("/profesores/all")
    public ResponseEntity<List<ProfesorOutputDTO>> getAllStudents(){
        return new ResponseEntity<>(findAllProfesor
                .getAllProfesors()
                .stream()
                .map(ProfesorOutputDTO::new)
                .toList(), HttpStatus.ACCEPTED);
    }
    @GetMapping("/profesores/find/{id}")
    public ResponseEntity<ProfesorOutputDTO> findPersonById(@PathVariable int id) throws Exception {
        return new ResponseEntity<>(new ProfesorOutputDTO(findByIdServiceImpl.findProfesorById(id)), HttpStatus.ACCEPTED);
    }
}
