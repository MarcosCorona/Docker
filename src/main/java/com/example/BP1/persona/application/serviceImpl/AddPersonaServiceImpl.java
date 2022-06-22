package com.example.BP1.persona.application.serviceImpl;

import com.example.BP1.persona.application.services.AddPersonaService;
import com.example.BP1.persona.domain.entity.Persona;
import com.example.BP1.persona.exception.NotFoundException404;
import com.example.BP1.persona.exception.UnprocesableException422;
import com.example.BP1.persona.infraestructure.repository.PersonaRepositorio;
import com.example.BP1.persona.infraestructure.repository.controller.dto.inputDTO.PersonaInputDTO;
import com.example.BP1.persona.infraestructure.repository.controller.dto.outputDTO.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddPersonaServiceImpl implements AddPersonaService{

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Override
    public PersonaOutputDTO addPersona(PersonaInputDTO personaDTO) throws NotFoundException404 {
        if (personaDTO == null) {
            throw new UnprocesableException422("No se recibió ninguna persona");
        }else if (personaDTO.getUsuario() == null) {
            throw new UnprocesableException422("Nombre de usuario inválido");
        } else if (personaDTO.getPassword() == null) {
            throw new UnprocesableException422("Contraseña inválida");
        } else if (personaDTO.getName() == null) {
            throw new UnprocesableException422("Nombre inválido.");
        } else if (personaDTO.getSurname() == null) {
            throw new UnprocesableException422("Apellido inválido");
        } else if (personaDTO.getCompany_email() == null) {
            throw new UnprocesableException422("Email de empresa inválido");
        } else if (personaDTO.getPersonal_email() == null) {
            throw new UnprocesableException422("Email personal inválido");
        } else if (personaDTO.getCity() == null) {
            throw new UnprocesableException422("Ciudad inválida");
        } else if (personaDTO.getCreated_date() == null) {
            throw new UnprocesableException422("El campo fecha de creación está vacío.");
        } else if (personaDTO.getImage_url() == null) {
            throw new UnprocesableException422("El campo imagen url está vacío.");
        } else if (personaDTO.getTermination_date() == null) {
            throw new UnprocesableException422("El campo fecha de terminación está vacío.");
        } else if (personaDTO.getUsuario().length() < 6) {
            throw new UnprocesableException422("La longitud de la contraseña es demasiado corta.\n" +
                    "Pruebe a escribir más de 6 carácteres.");
        } else {
            //pasamos la entidad persona a personaDTO
            Persona persona = new Persona(personaDTO);
            //lo guardamos
            personaRepositorio.save(persona);
            //guardamos el output
            PersonaOutputDTO saveOutputDTO = new PersonaOutputDTO(persona);
            //devolvemos el output dto en el controller.
            return saveOutputDTO;
        }
    }
}
