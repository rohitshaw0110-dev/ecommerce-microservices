package com.ecommerce.authservice.service;

import com.ecommerce.authservice.dto.RegisterRequest;
import com.ecommerce.authservice.dto.RegisterResponse;
import com.ecommerce.authservice.entity.User;
import com.ecommerce.authservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {

        if(userRepository.existsByEmail(registerRequest.getEmail())){
            throw new RuntimeException("Email already registered");
        }

        if(userRepository.existsByPhoneno(registerRequest.getPhoneno())){
            throw new RuntimeException("Phone number already registered");
        }

        User user = new User();

        user.setName(registerRequest.getName());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setPhoneno(registerRequest.getPhoneno());
        user.setRole("USER");
        user.setCreatedAt(LocalDateTime.now());

        User savedUser = userRepository.save(user);

        return new RegisterResponse("User registered successfully", savedUser.getId());
    }
}
