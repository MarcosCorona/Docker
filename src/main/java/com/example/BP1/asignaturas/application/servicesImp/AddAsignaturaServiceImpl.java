package com.example.BP1.asignaturas.application.servicesImp;

import com.example.BP1.asignaturas.application.services.AddAsignaturaService;
import com.example.BP1.asignaturas.domain.Asignatura;
import com.example.BP1.asignaturas.infraestructure.controller.dtos.output.AsignaturaOutputDTO;
import com.example.BP1.asignaturas.infraestructure.controller.dtos.input.AsignaturaInputDTO;
import com.example.BP1.asignaturas.infraestructure.repository.AsignaturasRepositorio;
import com.example.BP1.estudiante.application.services.FindStudentByIdService;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.persona.infraestructure.repository.exception.UnprocesableException422;
import com.example.BP1.profesor.application.services.FindProfesorByIdService;
import com.example.BP1.profesor.domain.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddAsignaturaServiceImpl implements AddAsignaturaService {

    @Autowired
    AsignaturasRepositorio asignaturasRepositorio;
    @Autowired
    FindStudentByIdService estudianteByIdService;
    @Autowired
    FindProfesorByIdService profesorByIdService;
    @Override
    public AsignaturaOutputDTO addAsignatura(AsignaturaInputDTO asignaturaInputDTO) throws Exception {
        if (asignaturaInputDTO == null) {
            throw new UnprocesableException422("No se recibió ninguna asignatura");
        }else if (asignaturaInputDTO.getAsignatura() == null) {
            throw new UnprocesableException422("Asignatura inválido");
        } else if (asignaturaInputDTO.getProfesor().getId_profesor() == null) {
            throw new UnprocesableException422("Profesor inválido.");
        }else if (asignaturaInputDTO.getComment() == null) {
            throw new UnprocesableException422("Comentario inválido.");
        } else if (asignaturaInputDTO.getInitial_date() == null) {
            throw new UnprocesableException422("Fecha inicio inválida.");
        } else if (asignaturaInputDTO.getFinish_date() == null) {
            throw new UnprocesableException422("Fecha final inválida.");
        } else {
            Asignatura asignatura = new Asignatura(asignaturaInputDTO);

            Profesor profesor = profesorByIdService.findProfesorById(asignaturaInputDTO.getProfesor().getId_profesor());
            asignatura.setProfesor(profesor);

            asignaturasRepositorio.save(asignatura);
            //guardamos el output.
            AsignaturaOutputDTO saveOutputDTO = new AsignaturaOutputDTO(asignatura);
            //devolvemos el output dto en el controller.
            return saveOutputDTO;
        }
    }
}
