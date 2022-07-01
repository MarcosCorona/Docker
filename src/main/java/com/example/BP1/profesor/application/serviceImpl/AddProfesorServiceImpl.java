package com.example.BP1.profesor.application.serviceImpl;

import com.example.BP1.estudiante.application.services.FindAllStudentsService;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.persona.application.services.FindByIdService;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.persona.infraestructure.repository.exception.UnprocesableException422;
import com.example.BP1.profesor.application.services.AddProfesorService;
import com.example.BP1.profesor.domain.Profesor;
import com.example.BP1.profesor.infraestructure.controller.dto.input.ProfesorInputDTO;
import com.example.BP1.profesor.infraestructure.controller.dto.output.ProfesorOutputDTO;
import com.example.BP1.profesor.infraestructure.repository.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddProfesorServiceImpl implements AddProfesorService {

    @Autowired
    ProfesorRepositorio profesorRepositorio;

    @Autowired
    FindByIdService personaByIdService;
    @Autowired
    FindAllStudentsService studentsService;
    @Override
    public ProfesorOutputDTO addProfesor(ProfesorInputDTO profesorInputDTO) throws Exception {
        if (profesorInputDTO == null) {
            throw new UnprocesableException422("No se recibió ningun profesor");
        }else if (profesorInputDTO.getBranch() == null) {
            throw new UnprocesableException422("Branch inválido");
        } else if (profesorInputDTO.getPersona().getId() == null) {
            throw new UnprocesableException422("Persona inválido.");
        }else {
            Profesor profesor = new Profesor(profesorInputDTO);
            Persona persona = personaByIdService.findPersonById(profesorInputDTO.getPersona().getId());
            profesor.setPersona(persona);

            //validacion de que no exista la persona como alumno.
            List<Estudiante> estudiantes = studentsService.getAllStudents();
            if(estudiantes != null){
                for (Estudiante e: estudiantes)
                {
                    if(e.getPersona().getId().equals(persona.getId())) {
                        throw new RuntimeException("La persona ya es estudiante.");
                    }
                }
            }
            profesorRepositorio.save(profesor);
            //guardamos el output
            ProfesorOutputDTO saveOutputDTO = new ProfesorOutputDTO(profesor);
            //devolvemos el output dto en el controller.
            return saveOutputDTO;
        }
    }
}
