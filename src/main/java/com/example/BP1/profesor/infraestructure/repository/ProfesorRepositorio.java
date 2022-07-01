package com.example.BP1.profesor.infraestructure.repository;


import com.example.BP1.profesor.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor,Integer>{

}
