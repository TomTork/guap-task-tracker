package com.tasktracker.user.rest.model;

import lombok.Data;

@Data
public class NotFoundDTO {
    private Integer status;
    private String message;
}
