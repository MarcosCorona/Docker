package com.example.BP1.persona.application.services;

import com.example.BP1.persona.domain.entity.Persona;


public interface FindByIdService {
    Persona findPersonById(int id) throws Exception;
}
