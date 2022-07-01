package com.example.BP1.estudiante.application.services;


import com.example.BP1.estudiante.domain.Estudiante;

public interface FindStudentByIdService {
    Estudiante findStudentById(Integer id) throws Exception;
}
