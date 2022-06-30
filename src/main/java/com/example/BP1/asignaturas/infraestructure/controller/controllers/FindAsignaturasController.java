package com.example.BP1.asignaturas.infraestructure.controller.controllers;

import com.example.BP1.asignaturas.application.services.FindAsignaturaByIdService;
import com.example.BP1.asignaturas.application.servicesImp.FindAllAsignaturaImpl;
import com.example.BP1.asignaturas.infraestructure.controller.dtos.output.AsignaturaOutputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class FindAsignaturasController {

    @Autowired
    FindAllAsignaturaImpl findAllAsignatura;
    @Autowired
    FindAsignaturaByIdService findByIdServiceImpl;

    @GetMapping("/asignaturas/all")
    public ResponseEntity<List<AsignaturaOutputDTO>> getAllAsignaturas(){
        return new ResponseEntity<>(findAllAsignatura
                .getAllAsignaturas()
                .stream()
                .map(AsignaturaOutputDTO::new)
                .toList(), HttpStatus.ACCEPTED);
    }
    @GetMapping("/asignaturas/find/{id}")
    public ResponseEntity<AsignaturaOutputDTO> findAsignaturaById(@PathVariable int id) throws Exception {
        return new ResponseEntity<>(new AsignaturaOutputDTO(findByIdServiceImpl.findAsignaturaById(id)), HttpStatus.ACCEPTED);
    }
    @GetMapping("/asignaturas/student/{id}")
    public ResponseEntity<List<AsignaturaOutputDTO>> findAsignaturaByEstudiante(@PathVariable int id) throws Exception {
        return new ResponseEntity<>(findByIdServiceImpl.findAsignaturaByStudent(id)
                .stream()
                .map(AsignaturaOutputDTO::new)
                .toList(), HttpStatus.ACCEPTED);
    }
}
