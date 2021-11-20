package com.estudiantes.estudiantes.controllers;

import com.estudiantes.estudiantes.exceptions.EstudianteNoEncontradoExcepcion;
import com.estudiantes.estudiantes.exceptions.CursoErroneoExcepcion;
import com.estudiantes.estudiantes.models.Estudiante;
import com.estudiantes.estudiantes.models.Cursos;
import com.estudiantes.estudiantes.repositories.RepositorioEstudiante;
import com.estudiantes.estudiantes.repositories.RepositorioMaterias;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class CursoControlador {
    private final RepositorioEstudiante repositorioEstudiante;
    private final RepositorioMaterias repositorioMaterias;

    public CursoControlador(RepositorioEstudiante repositorioEstudiante, RepositorioMaterias repositorioMaterias){
        this.repositorioEstudiante = repositorioEstudiante;
        this.repositorioMaterias = repositorioMaterias;
    }

    @PostMapping("/cursos")
    Cursos newCurso(@RequestBody Cursos cursos){
        Estudiante Nombrecurso = repositorioEstudiante.findById(cursos.getNombrecurso()).orElse(null);
        Estudiante Nombreestudiante = repositorioEstudiante.findById(cursos.Nombreestudiante()).orElse(null);

        if (Nombrecurso == null) throw new EstudianteNoEncontradoExcepcion("No se encontro un estudiante con el nombre:" + cursos.getNombrecurso());
        if (Nombreestudiante == null) throw new EstudianteNoEncontradoExcepcion("No se encontro un estudiante con el nombre:" + cursos.Nombreestudiante());
        if (Nombrecurso.getNombrecurso() < cursos.getValue()) throw new CursoErroneoExcepcion("No. Creditos Insuficientes");

        repositorioEstudiante.save(Nombrecurso);
        repositorioEstudiante.save(Nombreestudiante);
        return repositorioMaterias.save(cursos)

    }

    @GetMapping("/cursos/{Estudiante_nombre}")
    List<Cursos> estudianteCurso (@PathVariable String Estudiante_nombre){
        Estudiante nombreEstudiante = RepositorioEstudiante.findById(Estudiante_nombre).orElse(null);
        if (nombreEstudiante == null) throw new EstudianteNoEncontradoExcepcion("No se encontro el estudiante con el nombre:" + Estudiante_nombre);

        List<Cursos> Nombrecurso = repositorioMaterias.findByNombrecurso(Estudiante_nombre);
        List<Cursos> Nombreestudiante = repositorioMaterias.findByNombrecurso(Estudiante_nombre);

        return Cursos;
    }
}
