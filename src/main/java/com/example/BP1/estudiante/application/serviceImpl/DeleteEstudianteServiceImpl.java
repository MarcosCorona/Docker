package com.example.BP1.estudiante.application.serviceImpl;

import com.example.BP1.estudiante.application.services.DeleteEstudianteService;
import com.example.BP1.estudiante.domain.Estudiante;
import com.example.BP1.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.BP1.estudiante.infraestructure.repository.EstudianteRepositorio;
import com.example.BP1.persona.infraestructure.repository.exception.NotFoundException404;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEstudianteServiceImpl implements DeleteEstudianteService {
    @Autowired
    EstudianteRepositorio estudianteRepositorio;

    @Override
    public String deleteStudent(Integer id) throws Exception {
        try{
            estudianteRepositorio.deleteById(id);
        }catch(Exception e){
            System.out.println("No se encontro el id");
        }

        return "Estudiante eliminado";
    }
}
