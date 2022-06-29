package com.example.BP1.profesor.application.services;

import com.example.BP1.profesor.domain.Profesor;


public interface FindProfesorByIdService {
    Profesor findProfesorById(int id) throws Exception;
}
