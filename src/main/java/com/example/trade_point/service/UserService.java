package com.example.trade_point.service;

import com.example.trade_point.models.User;
import com.example.trade_point.models.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public interface UserService {
    UserDto findByUsername(String username);
    void saveUser(UserDto userDto);
    boolean existsByUsername(String username);
    User save(User user);
    UserDto findUserById(Long id);
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;


}

