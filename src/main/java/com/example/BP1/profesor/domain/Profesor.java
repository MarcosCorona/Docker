package com.example.BP1.profesor.domain;

import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="profesores")
public class Profesor {
    @Id
    @Column(name="id_profesor")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id_profesor;

    @OneToOne
    @JoinColumn(name = "idPersona")
    Persona persona;

    @Column(name = "rama")
    String branch;


    public Profesor(ProfesorInputDTO profesorInputDTO) {
        setId_profesor(profesorInputDTO.getId_profesor());
        setBranch(profesorInputDTO.getBranch());
    }


}
