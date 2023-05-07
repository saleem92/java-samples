package com.example.swagger.demo.common.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleNotFound(NotFound e) {
        return ErrorResponse.builder().status(e.getCode()).message(e.getMessage()).build();
    }

    @Builder
    static class ErrorResponse {
        private int status;
        private String message;
    }
}
