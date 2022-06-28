package com.example.BP1.estudiante.infraestructure.controller.dto.input;

import com.example.BP1.persona.domain.entity.Persona;
import lombok.Data;

@Data
public class EstudianteInputDTO {
    Integer id_student;
    Persona persona;
    Integer num_hours_week;
    String coments;
    //Profesor profesor;
    String branch;
    //List<Asignatura> estudios;
}
