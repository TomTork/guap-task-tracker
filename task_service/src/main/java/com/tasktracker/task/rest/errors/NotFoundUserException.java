package com.tasktracker.task.rest.errors;

public class NotFoundUserException extends NotFoundException {
    public NotFoundUserException(Integer id) {
        super("User not found: id=" + id);
    }
}
