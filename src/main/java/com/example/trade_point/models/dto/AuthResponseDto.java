package com.example.trade_point.models.dto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String token;
    private String message;

    // Конструктор
    public AuthResponseDto(String token, String message) {
        this.token = token;
        this.message = message;
    }

    // Getters и setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

