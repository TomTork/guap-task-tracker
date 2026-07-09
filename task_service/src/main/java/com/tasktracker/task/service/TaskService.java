package com.tasktracker.task.service;

import com.tasktracker.task.rest.model.TaskDTO;

import java.util.List;

public interface TaskService {
    List<TaskDTO> findAll();
    List<TaskDTO> findAllTasksByAssigneeId(Integer id);
    TaskDTO findById(Integer id);
    TaskDTO create(TaskDTO taskDTO);
    TaskDTO update(TaskDTO taskDTO);
}
