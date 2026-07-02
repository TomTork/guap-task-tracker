package com.tasktracker.user;

import com.tasktracker.user.db.model.User;
import com.tasktracker.user.rest.model.UserDTO;

public class Helper {
    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirst_name(user.getFirst_name());
        userDTO.setLast_name(user.getLast_name());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }
    public static User reverse(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setFirst_name(userDTO.getFirst_name());
        user.setLast_name(userDTO.getLast_name());
        user.setEmail(userDTO.getEmail());
        return user;
    }
}
