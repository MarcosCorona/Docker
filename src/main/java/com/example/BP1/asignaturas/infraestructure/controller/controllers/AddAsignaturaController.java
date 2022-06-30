package com.example.BP1.asignaturas.infraestructure.controller.controllers;

import com.example.BP1.asignaturas.application.services.AddAsignaturaService;
import com.example.BP1.asignaturas.infraestructure.controller.dtos.output.AsignaturaOutputDTO;
import com.example.BP1.asignaturas.infraestructure.controller.dtos.input.AsignaturaInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AddAsignaturaController {

    @Autowired
    AddAsignaturaService addAsignaturaService;

    @PostMapping("/asignatura/add")
    public ResponseEntity<AsignaturaOutputDTO> addAsignatura(@RequestBody AsignaturaInputDTO asignaturaInputDTO) throws Exception {
        return new ResponseEntity<>(new AsignaturaOutputDTO(addAsignaturaService.addAsignatura(asignaturaInputDTO)), HttpStatus.OK);
    }
}
