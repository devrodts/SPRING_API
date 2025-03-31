package com.devrodts.ecommerce.mapper;

import com.devrodts.ecommerce.dtos.UserRequestDTO;
import com.devrodts.ecommerce.dtos.UserResponseDTO;
import com.devrodts.ecommerce.entity.UserEntity;


public interface UserMapper {
    UserResponseDTO toResponse(User user);
    UserEntity toEntity(UserRequestDTO userRequest0);
}
