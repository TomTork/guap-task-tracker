package com.tasktracker.task.service;

import com.tasktracker.task.Helper;
import com.tasktracker.task.db.dao.TaskRepository;
import com.tasktracker.task.rest.model.TaskDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    @Override
    public List<TaskDTO> findAll() {
        return taskRepository.findAll().stream().map(Helper::convert).collect(Collectors.toList());
    }

    @Override
    public TaskDTO findById(Integer id) {
        return Helper.convert(taskRepository.findTaskById(id));
    }

    @Override
    public TaskDTO create(TaskDTO taskDTO) {
        return Helper.convert(taskRepository.save(Helper.convert(taskDTO)));
    }

    @Override
    public TaskDTO update(TaskDTO taskDTO) {
        return Helper.convert(taskRepository.save(Helper.convert(taskDTO)));
    }
}
