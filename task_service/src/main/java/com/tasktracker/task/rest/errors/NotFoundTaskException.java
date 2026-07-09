package com.tasktracker.task.rest.errors;

public class NotFoundTaskException extends NotFoundException {
    public NotFoundTaskException(Integer id) {
        super("Task not found: id=" + id);
    }
}
