package com.example.trade_point.service.Impl;

import com.example.trade_point.models.Role;
import com.example.trade_point.repository.RoleRepository;
import com.example.trade_point.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Optional<Role> findById(Long id) {
        return roleRepository.findById(id);
    }

    // Другие методы
}
