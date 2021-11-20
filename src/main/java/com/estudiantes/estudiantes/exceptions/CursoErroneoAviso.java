package com.estudiantes.estudiantes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody

public class CursoErroneoAviso {
    @ResponseBody
    @ExceptionHandler(CursoErroneoExcepcion.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String CursoErroneoAviso(CursoErroneoExcepcion ex){
        return ex.getMessage();
    }
}
