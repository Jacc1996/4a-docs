package com.estudiantes.estudiantes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class InsufficientNotaAdvice {
    @ResponseBody
    @ExceptionHandler(InsufficientNotaException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String InsufficientNotaAdvice(InsufficientNotaException ex) {
        return ex.getMessage();
    }
}
