package com.estudiantes.estudiantes.controllers;

import com.estudiantes.estudiantes.exceptions.EstudianteNoEncontradoExcepcion;
import com.estudiantes.estudiantes.models.Estudiante;
import com.estudiantes.estudiantes.repositories.RepositorioEstudiante;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteControlador {
    private final RepositorioEstudiante repositorioEstudiante;

    public EstudianteControlador(RepositorioEstudiante repositorioEstudiante) {
        this.repositorioEstudiante = repositorioEstudiante;
    }

    @GetMapping("/estudiante/{Estudiante_nombre}")
    Estudiante getEstudiante(@PathVariable String Estudiante_nombre){
        return repositorioEstudiante.findById(Estudiante_nombre).orElseThrow(() -> new EstudianteNoEncontradoExcepcion("No se encontro un estudiante con el nombre: " + Estudiante_nombre));
    }

    @PostMapping("/estudiante")
    Estudiante newEstudiante(@RequestBody Estudiante estudiante){
        return repositorioEstudiante.save(estudiante);
    }

}
