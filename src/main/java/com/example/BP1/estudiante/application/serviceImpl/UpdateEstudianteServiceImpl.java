package com.example.BP1.estudiante.application.serviceImpl;

import com.example.BP1.estudiante.application.services.FindStudentByIdService;
import com.example.BP1.estudiante.application.services.UpdateEstudianteService;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.BP1.estudiante.infraestructure.repository.EstudianteRepositorio;
import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEstudianteServiceImpl implements UpdateEstudianteService {
    @Autowired
    EstudianteRepositorio estudianteRepositorio;


    @Override
    public EstudianteOutputDTO updateEstudiante(Integer id, EstudianteInputDTO newEstudiante) throws Exception {
        Estudiante estudiante = estudianteRepositorio.findById(id).orElseThrow(() -> new NotFoundException404("No se encontró el id del alumno"));
        estudiante.setPersona(newEstudiante.getPersona());
        estudiante.setProfesor(newEstudiante.getProfesor());
        estudiante.setEstudios(newEstudiante.getEstudios());
        estudiante.setBranch(newEstudiante.getBranch());
        estudiante.setComents(newEstudiante.getComents());
        estudiante.setNum_hours_week(newEstudiante.getNum_hours_week());
        EstudianteOutputDTO saveOutputDTO = new EstudianteOutputDTO(estudiante);
        estudianteRepositorio.save(estudiante);
        return saveOutputDTO;
    }
}
