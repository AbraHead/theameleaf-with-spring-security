package ru.starosta.theameleafwithspringsecurity.service;

import ru.starosta.theameleafwithspringsecurity.dto.UserDto;
import ru.starosta.theameleafwithspringsecurity.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
