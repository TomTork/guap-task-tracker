package com.tasktracker.task.db.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "TASKS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
    private Integer creator_id;
    private Integer assignee_id;

    public Task(String title, TaskStatus status, Integer creator_id, Integer assignee_id) {
        this.title = title;
        this.status = status;
        this.creator_id = creator_id;
        this.assignee_id = assignee_id;
    }
}
