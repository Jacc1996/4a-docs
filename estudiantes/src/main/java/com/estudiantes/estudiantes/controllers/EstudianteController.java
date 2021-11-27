package com.estudiantes.estudiantes.controllers;

import com.estudiantes.estudiantes.exceptions.EstudianteNotFoundException;
import com.estudiantes.estudiantes.models.Estudiante;
import com.estudiantes.estudiantes.repositories.EstudianteRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteController {

    private final EstudianteRepository estudianteRepository;

    public EstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping("/estudiantes/{username]")
    Estudiante getEstudiante(@PathVariable String username){
        return estudianteRepository.findById(username)
                .orElseThrow(() -> new EstudianteNotFoundException("No se encontro un estudiante con el nombre: " + username));
    }

    @PostMapping("/estudiantes")
    Estudiante nuevoEstudiante(@RequestBody Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }
}
