package com.tasktracker.user.service;

import com.tasktracker.user.rest.model.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO>  findAll();
    UserDTO findById(Integer id);
    UserDTO create(UserDTO userDTO);
    UserDTO update(UserDTO userDTO);
}
