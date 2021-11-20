package com.estudiantes.estudiantes.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Cursos {
    @Id
    private String id;
    private String Nombrecurso;
    private String Nombreestudiante;
    private Integer value;
    private Date Fechamatricula;

    public Cursos(String id, String Nombrecurso, String Nombreestudiante, Integer value, Date Fechamatricula)
    {
        this.id = id;
        this.Nombrecurso = Nombrecurso;
        this.Nombreestudiante = Nombreestudiante;
        this.value = value;
        this.Fechamatricula = Fechamatricula;
    }

    public String getId(){
        return  id;
    }

    public String getNombrecurso(){
        return Nombrecurso;
    }

    public void setNombrecurso(String Nombrecurso){
        this.Nombrecurso = Nombrecurso;
    }

        public String Nombreestudiante() {
        return Nombreestudiante;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getFechamatricula() {
        return Fechamatricula;
    }

    public void setFechaMatricula(Date FechaMatricula) {
        this.Fechamatricula = FechaMatricula;
    }
}
