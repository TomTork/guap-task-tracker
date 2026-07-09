package com.tasktracker.task.rest;

import com.tasktracker.task.client.UserServiceClient;
import com.tasktracker.task.rest.errors.NotFoundTaskException;
import com.tasktracker.task.rest.errors.NotFoundUserException;
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
    private final UserServiceClient userServiceClient;

    @GetMapping("/")
    public ResponseEntity<List<TaskDTO>> getAllTasks(@RequestParam(required = false) Integer assigneeId) {
        if (assigneeId == null) return ResponseEntity.ok(taskService.findAll());
        if (!userServiceClient.userExists(assigneeId)) throw new NotFoundUserException(assigneeId);
        return ResponseEntity.ok(taskService.findAllTasksByAssigneeId(assigneeId));
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
    @PostMapping("/{task_id}/delegate")
    public ResponseEntity<TaskDTO> delegate(@PathVariable Integer task_id, @RequestParam Integer assigneeId) {
        if (!userServiceClient.userExists(assigneeId)) throw new NotFoundUserException(assigneeId);
        TaskDTO taskDTO = taskService.findById(task_id);
        if (taskDTO == null) throw new NotFoundTaskException(task_id);
        taskDTO.setAssignee_id(assigneeId);
        return ResponseEntity.ok(taskService.update(taskDTO));
    }
}
