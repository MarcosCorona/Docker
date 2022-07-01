package com.example.BP1.persona.infraestructure.repository;


import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona,Integer>{

    List<PersonaOutputDTO> findByName(String persona);
}
