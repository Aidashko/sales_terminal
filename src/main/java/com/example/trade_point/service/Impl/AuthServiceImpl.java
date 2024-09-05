package com.example.trade_point.service.Impl;

import com.example.trade_point.exception.UsernameAlreadyExistsException;
import com.example.trade_point.models.Role;
import com.example.trade_point.models.User;
import com.example.trade_point.models.dto.AuthResponseDto;
import com.example.trade_point.models.dto.RegistrationRequestDto;
import com.example.trade_point.service.AuthService;
import com.example.trade_point.service.RoleService;
import com.example.trade_point.service.UserService;
import com.example.trade_point.utils.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {
    private final UserService userService;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;


    public AuthServiceImpl(UserService userService, RoleService roleService, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userService = userService;
        this.roleService = roleService;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public AuthResponseDto register(RegistrationRequestDto registrationRequest) {
        if (userService.existsByUsername(registrationRequest.getUsername())) {
            throw new UsernameAlreadyExistsException("Username already exists");
        }

        Role role = roleService.findById(registrationRequest.getRoleId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid role ID"));

        User user = new User();
        user.setUsername(registrationRequest.getUsername());
        user.setEmail(registrationRequest.getEmail());
        user.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));
        user.setRole(role);
        user.setAddress(registrationRequest.getAddress());
        user.setPhone(registrationRequest.getPhone());

        userService.save(user);

        // Генерация токена, передавая имя пользователя
        String token = jwtUtil.generateToken(user.getUsername());

        return new AuthResponseDto(token, "User registered successfully");
    }
}
