package com.estudiantes.estudiantes.repositories;

import org.springframework.data.annotation.Id;
import com.estudiantes.estudiantes.models.Notas;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface NotasRepository extends MongoRepository<Notas,String> {
    List<Notas> findByID (Id id);
    List<Notas> findByNombre_Estudiante (String Nombre_Estudiante);
}
