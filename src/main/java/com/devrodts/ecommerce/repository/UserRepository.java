package com.devrodts.ecommerce.repository;
import com.devrodts.ecommerce.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findById (String email);

    boolean existsByEmail(String email);


}
