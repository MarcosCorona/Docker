package com.example.BP1.estudiante.infraestructure.controller.controllers;

import com.example.BP1.estudiante.application.serviceImpl.UpdateEstudianteServiceImpl;
import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UpdateStudentController {
    @Autowired
    UpdateEstudianteServiceImpl updateEstudianteService;

    @PutMapping("/estudiante/update/{id}")
    public ResponseEntity<EstudianteOutputDTO> updateStudent(@PathVariable("id") Integer id, @RequestBody EstudianteInputDTO estudianteInputDTO) throws Exception {
        return new ResponseEntity<>(new EstudianteOutputDTO(updateEstudianteService.updateEstudiante(id,estudianteInputDTO)), HttpStatus.OK);
    }
}
