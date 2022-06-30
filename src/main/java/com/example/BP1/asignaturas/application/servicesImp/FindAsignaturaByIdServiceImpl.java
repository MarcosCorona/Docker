package com.example.BP1.asignaturas.application.servicesImp;

import com.example.BP1.asignaturas.application.services.FindAllAsignaturaService;
import com.example.BP1.asignaturas.application.services.FindAsignaturaByIdService;
import com.example.BP1.asignaturas.domain.Asignatura;
import com.example.BP1.asignaturas.infraestructure.repository.AsignaturasRepositorio;
import com.example.BP1.estudiante.application.services.FindStudentByIdService;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;
import com.example.BP1.profesor.application.services.FindProfesorByIdService;
import com.example.BP1.profesor.domain.Profesor;
import com.example.BP1.profesor.infraestructure.repository.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FindAsignaturaByIdServiceImpl implements FindAsignaturaByIdService {

    @Autowired
    AsignaturasRepositorio asignaturasRepositorio;

    @Autowired
    FindStudentByIdService findStudentByIdService;

    @Override
    public Asignatura findAsignaturaById(int id) throws Exception {

        return asignaturasRepositorio.findById(id).orElseThrow(() -> new NotFoundException404("No se encontró el id"));

    }

    @Override
    public List<Asignatura> findAsignaturaByStudent(int id) throws Exception {
        Estudiante estudiante = findStudentByIdService.findStudentById(id);
        EstudianteOutputDTO estudianteOutputDTO = new EstudianteOutputDTO(estudiante);
        return estudianteOutputDTO.getEstudios();
    }
}
