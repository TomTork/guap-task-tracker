package com.tasktracker.task;

import com.tasktracker.task.db.model.Task;
import com.tasktracker.task.rest.model.TaskDTO;

public class Helper {
    public static TaskDTO convert(Task task) {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(task.getId());
        taskDTO.setTitle(task.getTitle());
        taskDTO.setStatus(task.getStatus());
        taskDTO.setAssignee_id(task.getAssignee_id());
        taskDTO.setCreator_id(task.getCreator_id());
        return taskDTO;
    }
    public static Task convert(TaskDTO taskDTO) {
        Task task = new Task();
        task.setId(taskDTO.getId());
        task.setTitle(taskDTO.getTitle());
        task.setStatus(taskDTO.getStatus());
        task.setAssignee_id(taskDTO.getAssignee_id());
        task.setCreator_id(taskDTO.getCreator_id());
        return  task;
    }
}
