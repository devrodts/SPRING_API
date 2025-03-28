package com.devrodts.ecommerce.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserSignUpDTO(@Email @NotBlank String email, @Size(min=8) String password) { }
