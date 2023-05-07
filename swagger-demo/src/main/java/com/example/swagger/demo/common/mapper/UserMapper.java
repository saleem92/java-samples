package com.example.swagger.demo.common.mapper;

import com.example.swagger.demo.dto.UserDTO;
import com.example.swagger.demo.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userEntityToDTO(User user);

    User userDTOToEntity(UserDTO userDTO);
}
