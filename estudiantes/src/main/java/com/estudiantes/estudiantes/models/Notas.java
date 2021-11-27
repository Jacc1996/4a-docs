package com.estudiantes.estudiantes.models;

import org.springframework.data.annotation.Id;

public class Notas {
    @Id
    private String Id;
    private String Nombre_Estudiante;
    private Integer Nota1;
    private Integer Nota2;
    private Integer Nota3;

    public Notas(String id, String nombre_Estudiante, Integer nota1, Integer nota2, Integer nota3) {
        Id = id;
        Nombre_Estudiante = nombre_Estudiante;
        Nota1 = nota1;
        Nota2 = nota2;
        Nota3 = nota3;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre_Estudiante() {
        return Nombre_Estudiante;
    }

    public void setNombre_Estudiante(String nombre_Estudiante) {
        Nombre_Estudiante = nombre_Estudiante;
    }

    public Integer getNota1() {
        return Nota1;
    }

    public void setNota1(Integer nota1) {
        Nota1 = nota1;
    }

    public Integer getNota2() {
        return Nota2;
    }

    public void setNota2(Integer nota2) {
        Nota2 = nota2;
    }

    public Integer getNota3() {
        return Nota3;
    }

    public void setNota3(Integer nota3) {
        Nota3 = nota3;
    }
}


