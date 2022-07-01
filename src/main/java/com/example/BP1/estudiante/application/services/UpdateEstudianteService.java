package com.example.BP1.estudiante.application.services;

import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;

public interface UpdateEstudianteService {

    EstudianteOutputDTO updateEstudiante(Integer id, EstudianteInputDTO newEstudiante) throws Exception;
}
