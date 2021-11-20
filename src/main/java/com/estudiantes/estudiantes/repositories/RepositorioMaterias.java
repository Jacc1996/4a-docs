package com.estudiantes.estudiantes.repositories;

import com.estudiantes.estudiantes.models.Cursos;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface RepositorioMaterias extends MongoRepository<Cursos, String> {
    List<Cursos> findByNombrecurso (String Nombrecurso);
    List<Cursos> findByNombreestudiante (String Nombreestudiante);
}
