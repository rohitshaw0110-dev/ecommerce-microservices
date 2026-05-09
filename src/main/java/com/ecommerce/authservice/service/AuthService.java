package com.ecommerce.authservice.service;

import com.ecommerce.authservice.dto.RegisterRequest;
import com.ecommerce.authservice.dto.RegisterResponse;

public interface AuthService {
    RegisterResponse register (RegisterRequest registerRequest);
}
