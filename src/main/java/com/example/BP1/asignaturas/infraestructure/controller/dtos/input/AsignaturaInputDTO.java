package com.example.BP1.asignaturas.infraestructure.controller.dtos.input;

import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.profesor.domain.Profesor;
import lombok.Data;

import java.util.Date;
@Data
public class AsignaturaInputDTO {
    Integer id_asignatura;
    Profesor profesor;
    String asignatura;
    String comment;
    Date initial_date;
    Date finish_date;
}
