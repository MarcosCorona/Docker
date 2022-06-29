package com.example.BP1.estudiante.infraestructure.controller.dto.output;

import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.profesor.domain.Profesor;
import lombok.Data;

@Data
public class EstudianteOutputDTO {

    Integer id_student;
    Persona persona;
    Integer num_hours_week;
    String coments;
    Profesor profesor;
    String branch;
    //List<Asignatura> estudios;

    public EstudianteOutputDTO(EstudianteOutputDTO estudiante) {
        setId_student(estudiante.getId_student());
        setPersona(estudiante.getPersona());
        setNum_hours_week(estudiante.getNum_hours_week());
        setComents(estudiante.getComents());
        setProfesor(estudiante.getProfesor());
        setBranch(estudiante.getBranch());
        //setEstudios(estudiante.getEstudios());
    }
    public EstudianteOutputDTO(Estudiante estudiante) {
        setId_student(estudiante.getId_student());
        setPersona(estudiante.getPersona());
        setNum_hours_week(estudiante.getNum_hours_week());
        setComents(estudiante.getComents());
        setProfesor(estudiante.getProfesor());
        setBranch(estudiante.getBranch());
        //setEstudios(estudiante.getEstudios());
    }


}
