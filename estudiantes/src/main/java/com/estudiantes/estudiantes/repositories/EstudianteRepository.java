package com.estudiantes.estudiantes.repositories;

import com.estudiantes.estudiantes.models.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstudianteRepository extends MongoRepository <Estudiante, String>{ }
