package com.example.trade_point.mapper;

import com.example.trade_point.models.User;
import com.example.trade_point.models.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}
