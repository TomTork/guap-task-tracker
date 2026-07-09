package com.tasktracker.user.rest.errors;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Integer id) {
        super("User not found: id=" + id);
    }
}
