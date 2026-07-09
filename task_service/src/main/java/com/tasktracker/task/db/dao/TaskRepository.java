package com.tasktracker.task.db.dao;

import com.tasktracker.task.db.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findAll();
    Task findTaskById(Integer id);
    @Query("SELECT t FROM Task t WHERE t.assignee_id = :assigneeId")
    List<Task> findTasksByAssignee_id(@Param("assigneeId") Integer assigneeId);
}
