package com.tasktracker.user.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Пользователи")
public class UserDTO {
    @Schema(description = "Идентификатор пользователя")
    private Integer id;
    private String first_name;
    private String last_name;
    private String email;
}
