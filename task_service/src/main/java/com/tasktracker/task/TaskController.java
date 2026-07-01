package com.tasktracker.task;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
class TaskController {

    @GetMapping("/health")
    Map<String, String> health() {
        return Map.of(
                "service", "task-service",
                "status", "UP"
        );
    }
}
