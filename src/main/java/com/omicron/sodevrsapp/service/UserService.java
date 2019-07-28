package com.omicron.sodevrsapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.omicron.sodevrsapp.shared.dto.ProUserDto;
import com.omicron.sodevrsapp.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto userDto);
	ProUserDto createUser(ProUserDto proUserDto);
	UserDto getUserByEmail(String email);
	UserDto getUserByUserId(String userId);
	ProUserDto updateUser(String userId,ProUserDto proUserDto);
	UserDto updateUser(String userId,UserDto userDto);
}
