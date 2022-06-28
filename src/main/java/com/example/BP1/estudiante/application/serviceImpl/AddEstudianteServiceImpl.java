package com.example.BP1.estudiante.application.serviceImpl;

import com.example.BP1.estudiante.application.services.AddEstudianteService;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.BP1.estudiante.infraestructure.repository.EstudianteRepositorio;
import com.example.BP1.persona.application.services.FindByIdService;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;
import com.example.BP1.persona.infraestructure.repository.exception.UnprocesableException422;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEstudianteServiceImpl implements AddEstudianteService {

    @Autowired
    EstudianteRepositorio estudianteRepositorio;

    @Autowired
    FindByIdService personaByIdService;

    @Override
    public EstudianteOutputDTO addEstudiante(EstudianteInputDTO estudianteInputDTO) throws Exception {
        if (estudianteInputDTO == null) {
            throw new UnprocesableException422("No se recibió ningun estudiante");
        }else if (estudianteInputDTO.getBranch() == null) {
            throw new UnprocesableException422("Branch inválido");
        } else if (estudianteInputDTO.getComents() == null) {
            throw new UnprocesableException422("Comentario inválido.");
        } /*else if (estudianteInputDTO.getEstudios() == null) {
            throw new UnprocesableException422("Estudios inválido");
        } /*else if (estudianteInputDTO.getProfesor() == null) {
            throw new UnprocesableException422("Email de empresa inválido");
        } */else if (estudianteInputDTO.getNum_hours_week() == null) {
            throw new UnprocesableException422("Email personal inválido");
        } else {
            Estudiante estudiante = new Estudiante(estudianteInputDTO);
            Persona persona = personaByIdService.findPersonById(estudianteInputDTO.getPersona().getId());
            estudiante.setPersona(persona);
            System.out.println(persona);
            System.out.println(estudiante);
            estudianteRepositorio.save(estudiante);
            //guardamos el output
            EstudianteOutputDTO saveOutputDTO = new EstudianteOutputDTO(estudiante);
            //devolvemos el output dto en el controller.
            return saveOutputDTO;
        }
    }
}
