package com.example.BP1.estudiante.application.services;

import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;

public interface AddEstudianteService {
    EstudianteOutputDTO addEstudiante(EstudianteInputDTO persona) throws Exception;

}