package com.example.trade_point.models.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long userId;
    private String username;
    private String email;
    private String password;
    private Long roleId;
}
