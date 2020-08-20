package com.cs473.helloworld.web.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cs473.helloworld.exception.NotFoundException;
import com.cs473.helloworld.web.ExceptionResponse;

@RestControllerAdvice
public class HelloWorldControllerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionResponse exception(Exception ex) {
        return ExceptionResponse.builder()
                .message(ex.getMessage())
                .build();
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionResponse exception(RuntimeException ex) {
        return ExceptionResponse.builder()
                .message(ex.getMessage())
                .build();
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse exception(NotFoundException ex) {
        return ExceptionResponse.builder()
                .message(ex.getMessage())
                .build();
    }
}
