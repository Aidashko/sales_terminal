package com.example.trade_point.models.dto;

import lombok.Data;
@Data
public class ActivationRequestDto {
    private String email;
    private Integer code;
}
