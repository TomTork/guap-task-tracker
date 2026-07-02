package com.tasktracker.user.service;

import com.tasktracker.user.Helper;
import com.tasktracker.user.db.dao.UserRepository;
import com.tasktracker.user.rest.model.UserDTO;
import com.tasktracker.user.db.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(Helper::convert).collect(Collectors.toList());
    }
    @Override
    public UserDTO findById(Integer id) {
        return Helper.convert(userRepository.findUserById(id));
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        return Helper.convert(userRepository.save(Helper.reverse(userDTO)));
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return null;
    }
}
