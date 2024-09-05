package com.example.trade_point.models.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RegistrationRequestDto {
    private String username;
    private String email;
    private String password;
    private String address;
    private String phone;
    private Long roleId;
    private Long storeId; // Может быть null

    public RegistrationRequestDto(RegistrationRequestDto registrationRequestDto) {
        this.username = registrationRequestDto.getUsername();
        this.email = registrationRequestDto.getEmail();
        this.password = registrationRequestDto.getPassword();
    }

    // Getters and setters
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
