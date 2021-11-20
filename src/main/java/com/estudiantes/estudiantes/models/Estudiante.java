package com.estudiantes.estudiantes.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Estudiante {
    @Id
    private String Estudiante_nombre;
    private Integer Estudiante_edad;
    private Date Estudiante_fcha_nto;

    public Estudiante(String Estudiante_nombre, Integer Estudiante_edad, Date Estudiante_fcha_nto) {
        this.Estudiante_nombre = Estudiante_nombre;
        this.Estudiante_edad = Estudiante_edad;
        this.Estudiante_fcha_nto = Estudiante_fcha_nto;
    }
    public String getEstudiante_nombre() {
        return Estudiante_nombre;
    }
    public void setEstudiante_nombre(String Estudiante_nombre) {
        this.Estudiante_nombre = Estudiante_nombre;
    }
    public Integer getEstudiante_edad() {
        return Estudiante_edad;
    }
    public void setEstudiante_edad(Integer Estudiante_edad) {
        this.Estudiante_edad = Estudiante_edad;
    }
    public Date getEstudiante_fcha_nto() {
        return Estudiante_fcha_nto;
    }
    public void setEstudiante_fcha_nto(Date Estudiante_fcha_nto) {
        this.Estudiante_fcha_nto = Estudiante_fcha_nto;
    }
}