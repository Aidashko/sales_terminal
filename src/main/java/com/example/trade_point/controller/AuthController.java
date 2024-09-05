package com.example.trade_point.controller;
import com.example.trade_point.models.dto.ActivationRequestDto;
import com.example.trade_point.models.dto.AuthRequestDto;
import com.example.trade_point.models.dto.AuthResponseDto;
import com.example.trade_point.models.dto.RegistrationRequestDto;
import com.example.trade_point.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponseDto> register(@RequestBody @Valid RegistrationRequestDto registrationRequest) {
        AuthResponseDto response = authService.register(registrationRequest);
        return ResponseEntity.ok(response);
    }

    // Другие методы
}

