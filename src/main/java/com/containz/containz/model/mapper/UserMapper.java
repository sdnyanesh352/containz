package com.containz.containz.model.mapper;



import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.containz.containz.dto.RoleDto;
import com.containz.containz.dto.UserDto;
import com.containz.containz.model.User;

import java.util.HashSet;

import java.util.stream.Collectors;

/**
 *
 */
@Component
public class UserMapper {

    public static UserDto toUserDto(User user) {
        return new UserDto()
                .setEmail(user.getEmail())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setMobileNumber(user.getMobileNumber())
                .setRoles(new HashSet<RoleDto>(user
                        .getRoles()
                        .stream()
                        .map(role -> new ModelMapper().map(role, RoleDto.class))
                        .collect(Collectors.toSet())));
    }
    
    public User toEntity(UserDto userDto) {
        if (userDto == null) {
            return null;
        }
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setMobileNumber(userDto.getMobileNumber());
        user.setUsername(userDto.getUsername().toLowerCase());
        user.setCoins(userDto.getCoins());
        
   
        
        return user;
    }

}
