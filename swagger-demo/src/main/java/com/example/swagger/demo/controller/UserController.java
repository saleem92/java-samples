package com.example.swagger.demo.controller;

import com.example.swagger.demo.dto.UserDTO;
import com.example.swagger.demo.service.UserService;
import com.example.swagger.demo.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @PatchMapping("{id}")
    public UserDTO updateUser(@RequestParam UUID id, @RequestBody UserDTO userDTO) throws Exception {
        return userService.updateUser(id, userDTO);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@RequestParam UUID id) throws Exception {
        userService.deleteUser(id);
    }
}
