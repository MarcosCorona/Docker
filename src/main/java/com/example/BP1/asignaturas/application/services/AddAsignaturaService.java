package com.example.BP1.asignaturas.application.services;

import com.example.BP1.asignaturas.infraestructure.controller.dtos.output.AsignaturaOutputDTO;
import com.example.BP1.asignaturas.infraestructure.controller.dtos.input.AsignaturaInputDTO;

public interface AddAsignaturaService {
    AsignaturaOutputDTO addAsignatura(AsignaturaInputDTO asignaturaInputDTO) throws Exception;

}