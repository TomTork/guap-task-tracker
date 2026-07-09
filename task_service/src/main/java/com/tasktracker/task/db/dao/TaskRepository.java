package com.tasktracker.task.db.dao;

import com.tasktracker.task.db.model.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findAll();
    Task findTaskById(Integer id);
}
