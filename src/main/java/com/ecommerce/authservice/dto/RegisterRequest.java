package com.ecommerce.authservice.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {

    @NotBlank (message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank (message = "Email is required")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters")
    @NotBlank (message = "Password is required")
    private String password;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phoneno must be exactly 10 digits")
    @NotBlank (message = "Phoneno is required")
    private String phoneno;
}
