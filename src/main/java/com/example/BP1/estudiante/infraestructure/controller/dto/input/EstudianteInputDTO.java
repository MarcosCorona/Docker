package com.example.BP1.estudiante.infraestructure.controller.dto.input;

import com.example.BP1.asignaturas.domain.Asignatura;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.profesor.domain.Profesor;
import lombok.Data;

import java.util.List;

@Data
public class EstudianteInputDTO {
    Integer id_student;
    Persona persona;
    Integer num_hours_week;
    String coments;
    Profesor profesor;
    String branch;
    List<Asignatura> estudios;
}
