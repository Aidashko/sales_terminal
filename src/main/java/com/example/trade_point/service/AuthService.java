package com.example.trade_point.service;

import com.example.trade_point.models.dto.AuthRequestDto;
import com.example.trade_point.models.dto.AuthResponseDto;
import com.example.trade_point.models.dto.RegistrationRequestDto;
import org.springframework.http.ResponseEntity;


public interface AuthService {
    AuthResponseDto register(RegistrationRequestDto registrationRequest);
    // Другие методы
}
