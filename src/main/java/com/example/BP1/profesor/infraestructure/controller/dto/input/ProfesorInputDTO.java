package com.example.BP1.profesor.infraestructure.controller.dto.input;

import com.example.BP1.persona.domain.entity.Persona;
import lombok.Data;

@Data
public class ProfesorInputDTO {
    Integer id_profesor;
    Persona persona;
    String branch;
}
