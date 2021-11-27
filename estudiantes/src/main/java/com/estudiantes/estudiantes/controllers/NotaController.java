package com.estudiantes.estudiantes.controllers;

import com.estudiantes.estudiantes.exceptions.EstudianteNotFoundException;
import com.estudiantes.estudiantes.exceptions.InsufficientNotaException;
import com.estudiantes.estudiantes.models.Estudiante;
import com.estudiantes.estudiantes.models.Notas;
import com.estudiantes.estudiantes.repositories.EstudianteRepository;
import com.estudiantes.estudiantes.repositories.NotasRepository;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class NotaController {
    private final EstudianteRepository estudianteRepository;
    private final NotasRepository notasRepository;

    public NotaController(EstudianteRepository estudianteRepository, NotasRepository notasRepository){
        this.estudianteRepository = estudianteRepository;
        this.notasRepository = notasRepository;
    }

    @PostMapping("/notas")
    Notas newNotas(@RequestBody Notas notas){
        Estudiante estudianteSeleccionado = estudianteRepository.findById(notas.getNombre_Estudiante()).orElse(null);

        if (estudianteSeleccionado == null) throw new EstudianteNotFoundException("No se encontro una cuenta con el nombre de estudiante:" + notas.getNombre_Estudiante());

        return notasRepository.save(notas);
    }

    @GetMapping("/notas/{username}")
    List<Notas> Notas_Estudiante(@PathVariable String username) {
        Estudiante usuarioEstudiante = estudianteRepository.findById(username).orElse(null);
        if (usuarioEstudiante == null) throw new EstudianteNotFoundException("No se encontro una cuenta con el nombre de estudiante:" + username);

        List<Notas> notas_estudiante = notasRepository.findByNombre_Estudiante(username);
        List<Notas> notas = (notas_estudiante.stream()).collect(Collectors.toList());

        return notas;
    }

}
