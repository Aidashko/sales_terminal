package com.example.trade_point.service;

import com.example.trade_point.models.Role;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findById(Long id);}
