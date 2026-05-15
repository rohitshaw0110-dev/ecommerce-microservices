package com.ecommerce.authservice.service;

import com.ecommerce.authservice.dto.LoginRequest;
import com.ecommerce.authservice.dto.LoginResponse;
import com.ecommerce.authservice.dto.RegisterRequest;
import com.ecommerce.authservice.dto.RegisterResponse;

public interface AuthService {
    RegisterResponse register (RegisterRequest request);
    LoginResponse login (LoginRequest request);
}
