package com.example.trade_point.models.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AuthRequestDto {
    private String username;
    private String password;
}
