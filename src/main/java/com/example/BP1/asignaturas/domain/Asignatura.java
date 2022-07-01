package com.example.BP1.asignaturas.domain;

import com.example.BP1.asignaturas.infraestructure.controller.dtos.input.AsignaturaInputDTO;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.profesor.domain.Profesor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="asignaturas")
public class Asignatura {
    @Id
    @Column(name = "id_asignatura")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id_asignatura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor")
    Profesor profesor;

    @Column(name = "asignatura")
    String asignatura;
    @Column(name = "comentarios")
    String comment;
    @Column(name = "initial_date")
    Date initial_date;
    @Column(name = "finish_date")
    Date finish_date;

    public Asignatura(AsignaturaInputDTO asignatura) {
        setId_asignatura(asignatura.getId_asignatura());
        setProfesor(asignatura.getProfesor());
        setAsignatura(asignatura.getAsignatura());
        setComment(asignatura.getComment());
        setInitial_date(asignatura.getInitial_date());
        setFinish_date(asignatura.getFinish_date());
    }
}