package com.example.userservice.service;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);
}
