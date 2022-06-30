package com.example.BP1.estudiante.infraestructure.controller.controllers;

import com.example.BP1.estudiante.application.serviceImpl.DeleteEstudianteServiceImpl;
import com.example.BP1.estudiante.application.serviceImpl.UpdateEstudianteServiceImpl;
import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeleteStudentController {
    @Autowired
    DeleteEstudianteServiceImpl deleteEstudianteService;

    @DeleteMapping("/estudiante/delete/{id}")
    public String updateStudent(@PathVariable("id") Integer id) throws Exception {
        deleteEstudianteService.deleteStudent(id);
        return "Estudiante eliminado";
    }
}
