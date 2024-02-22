package com.nhnacademy.mini.dooray.entity;

import com.nhnacademy.mini.dooray.domain.StateType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @Column(name = "task_id")
    private Long taskId;

    @ManyToOne
    @JoinColumn(name = "milestone_id")
    private Milestone milestone;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "task_title")
    private String taskTitle;

    @Column(name = "task_content")
    private String taskContent;

    @Column(name = "task_created_at")
    private Timestamp taskCreatedAt;

    @Column(name = "task_state")
    private StateType state;

}