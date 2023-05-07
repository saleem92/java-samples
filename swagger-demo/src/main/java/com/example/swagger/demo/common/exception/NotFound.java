package com.example.swagger.demo.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NotFound extends RuntimeException {

    private int code;
    private String message;
}
