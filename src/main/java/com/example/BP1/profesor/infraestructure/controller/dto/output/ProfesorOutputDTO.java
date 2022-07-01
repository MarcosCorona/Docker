package com.example.BP1.profesor.infraestructure.controller.dto.output;

import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.profesor.domain.Profesor;
import lombok.Data;

@Data
public class ProfesorOutputDTO {

    Integer id_profesor;
    Persona persona;
    String branch;

    public ProfesorOutputDTO(ProfesorOutputDTO profesorOutputDTO) {
        setId_profesor(profesorOutputDTO.getId_profesor());
        setPersona(profesorOutputDTO.getPersona());
        setBranch(profesorOutputDTO.getBranch());
    }
    public ProfesorOutputDTO(Profesor profesor) {
        setId_profesor(profesor.getId_profesor());
        setPersona(profesor.getPersona());
        setBranch(profesor.getBranch());

    }



}
