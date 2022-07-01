package com.example.BP1.estudiante.application.services;

import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.BP1.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
import com.example.BP1.profesor.infraestructure.controller.dto.output.ProfesorOutputDTO;

public interface AddEstudianteService {
    EstudianteOutputDTO addEstudiante(EstudianteInputDTO persona) throws Exception;

}