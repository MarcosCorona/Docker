package com.example.BP1.asignaturas.infraestructure.controller.dtos.output;

import com.example.BP1.asignaturas.domain.Asignatura;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.BP1.profesor.domain.Profesor;
import lombok.Data;

import java.util.Date;
@Data
public class AsignaturaOutputDTO {

    Integer id_asignatura;
    Profesor profesor;

    String asignatura;
    String comment;
    Date initial_date;
    Date finish_date;

    public AsignaturaOutputDTO(AsignaturaOutputDTO asignatura) {
        setId_asignatura(asignatura.getId_asignatura());
        setProfesor(asignatura.getProfesor());
        setAsignatura(asignatura.getAsignatura());
        setComment(asignatura.getComment());
        setInitial_date(asignatura.getInitial_date());
        setFinish_date(asignatura.getFinish_date());
    }
    public AsignaturaOutputDTO(Asignatura asignatura) {
        setId_asignatura(asignatura.getId_asignatura());
        setProfesor(asignatura.getProfesor());
        setAsignatura(asignatura.getAsignatura());
        setComment(asignatura.getComment());
        setInitial_date(asignatura.getInitial_date());
        setFinish_date(asignatura.getFinish_date());

    }

    public AsignaturaOutputDTO(EstudianteOutputDTO asignaturaByStudent) {
        asignaturaByStudent.getEstudios();
    }
}
