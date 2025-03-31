package com.devrodts.ecommerce.repository;
import com.devrodts.ecommerce.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    @Modifying
    Optional<UserEntity> findUserEntityByUserID(Long userID);

    @Modifying
    UserEntity updateByUserID(Long userId);
    UserEntity findByEmail(String email);

    @Modifying
    UserEntity deleteUserEntityByUserID(Long userID);

    UserEntity createUser(UserEntity user);
}
