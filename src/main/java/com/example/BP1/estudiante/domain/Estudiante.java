package com.example.BP1.estudiante.domain;

import com.example.BP1.asignaturas.domain.Asignatura;
import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.profesor.domain.Profesor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="estudiante")
public class Estudiante {
    @Id
    @Column(name = "id_estudiante")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id_student;

    @OneToOne
    @JoinColumn(name = "idPersona")
    Persona persona;

    @Column(name = "horas_por_semana")
    Integer num_hours_week;

    @Column(name = "comentarios")
    String coments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor")
    Profesor profesor;

    @Column(name = "rama")
    String branch;

    @OneToMany
    @Nullable()
    List<Asignatura> estudios;

    public Estudiante(EstudianteInputDTO estudiante) {
        setId_student(estudiante.getId_student());
        setPersona(estudiante.getPersona());
        setNum_hours_week(estudiante.getNum_hours_week());
        setComents(estudiante.getComents());
        setProfesor(estudiante.getProfesor());
        setBranch(estudiante.getBranch());
        setEstudios(estudiante.getEstudios());
    }


}
