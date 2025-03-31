package com.devrodts.ecommerce.service;
import com.devrodts.ecommerce.dtos.UserSignUpDTO;
import com.devrodts.ecommerce.entity.UserEntity;
import com.devrodts.ecommerce.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository, UserEntity userEntity) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserSignUpDTO user) {

        try{
            return userRepository.save(user);
        }catch(Error error){
            log.error(String.valueOf(error));
            throw error;

        }
    }

    public  UserEntity getUserById(Long userId){
        try{
            return userRepository.findUserEntityByUserID(userId).orElseThrow();
        }catch(Error error){
            log.error(String.valueOf(error));
            throw error;
        }
    }


}
