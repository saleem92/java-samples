package com.example.swagger.demo.service;

import com.example.swagger.demo.dto.UserDTO;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<UserDTO> getUsers();

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(UUID id, UserDTO userDTO) throws Exception;

    void deleteUser(UUID id) throws Exception;
}
