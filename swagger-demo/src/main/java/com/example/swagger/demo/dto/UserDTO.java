package com.example.swagger.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserDTO {

    private UUID id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private Role role;
}
