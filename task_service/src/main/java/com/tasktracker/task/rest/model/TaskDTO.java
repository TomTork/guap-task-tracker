package com.tasktracker.task.rest.model;

import com.tasktracker.task.db.model.TaskStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Задачи")
public class TaskDTO {
    @Schema(description = "Идентификатор задачи")
    private Integer id;
    private String title;
    private TaskStatus status;
    private Integer creator_id;
    private Integer assignee_id;
}
