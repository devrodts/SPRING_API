package com.devrodts.ecommerce.usecases;

import com.devrodts.ecommerce.dtos.UserRequestDTO;
import com.devrodts.ecommerce.dtos.UserResponseDTO;
import com.devrodts.ecommerce.dtos.UserSignUpDTO;
import com.devrodts.ecommerce.entity.UserEntity;
import com.devrodts.ecommerce.mapper.UserMapper;
import com.devrodts.ecommerce.repository.UserRepository;
import com.devrodts.ecommerce.service.PasswordEncoder;
import com.devrodts.ecommerce.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Slf4j
@Service
@RequiredArgsConstructor
public class SignUpUseCase {

    private UserService userService;

    public UserService execute(UserSignUpDTO userSignUpDTO){
        try{
            UserEntity newUser = userService.createUser(userSignUpDTO);
        }catch(Exception error){
            log.error("Error creating user: ", error);
            throw error;
        }
        return userService;
    }


}
