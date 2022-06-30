package com.example.BP1.estudiante.application.services;

import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;

public interface DeleteEstudianteService {

    String deleteStudent(Integer id) throws Exception;

}
