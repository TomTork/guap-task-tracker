package com.tasktracker.task.rest;

import com.tasktracker.task.rest.model.TaskDTO;
import com.tasktracker.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/")
    public ResponseEntity<List<TaskDTO>> getAllTasks() {
        return ResponseEntity.ok(taskService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<TaskDTO> getTaskById(@PathVariable Integer id) {
        return ResponseEntity.ok(taskService.findById(id));
    }
    @PostMapping("/")
    public ResponseEntity<TaskDTO> updateTask(@RequestBody TaskDTO taskDTO) {
        return ResponseEntity.ok(taskService.update(taskDTO));
    }
    @PutMapping
    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskDTO) {
        return ResponseEntity.ok(taskService.create(taskDTO));
    }
}
