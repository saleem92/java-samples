package com.example.swagger.demo.service;

import com.example.swagger.demo.dto.UserDTO;
import com.example.swagger.demo.entity.User;
import com.example.swagger.demo.common.exception.NotFound;
import com.example.swagger.demo.common.mapper.UserMapper;
import com.example.swagger.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper mapper;

    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream().map(mapper::userEntityToDTO).toList();
    }

    public UserDTO createUser(UserDTO userDTO) {
        var user = mapper.userDTOToEntity(userDTO);
        userRepository.save(user);
        return mapper.userEntityToDTO(user);
    }

    public UserDTO updateUser(UUID id, UserDTO userDTO) throws Exception {
        var user = findUser(id);
        var entity = mapper.userDTOToEntity(userDTO);
        entity.setId(id);
        userRepository.save(entity);
        return mapper.userEntityToDTO(entity);
    }

    public void deleteUser(UUID id) throws Exception {
        var user = findUser(id);
        userRepository.delete(user);
    }

    private User findUser(UUID id) throws Exception {
        Optional<User> entity = userRepository.findById(id);

        if (entity.isEmpty()) {
            throw new NotFound(HttpStatus.NOT_FOUND.value(), "User not found");
        }

        return entity.get();
    }
}
