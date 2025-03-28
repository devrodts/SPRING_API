package com.devrodts.ecommerce.dtos;
import java.time.LocalDate;
import java.util.UUID;

public record UserResponseDTO() {
    static UUID userId;
    static String email;
    static LocalDate createdAt;
}

