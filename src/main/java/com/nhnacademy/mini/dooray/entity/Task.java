package com.nhnacademy.mini.dooray.entity;

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

    @EmbeddedId
    private Pk pk;

    @Column(name = "task_content")
    private String taskContent;

    @Column(name = "task_created_at")
    private Timestamp taskCreatedAt;

    @Embeddable
    private static class Pk implements Serializable {
        @Column(name = "task_id")
        private Long taskId;

        @Column(name = "task_title", length = 32)
        private String taskTitle;
    }

//    @ManyToOne
//    @JoinColumn(name = "project_id")
//    private Project project;
//
//    @ManyToOne
//    @JoinColumn(name = "state_id")
//    private State state;
//
//    @ManyToOne
//    @JoinColumn(name = "milestone_id")
//    private Milestone milestone;
//
//    @OneToMany(mappedBy = "task")
//    private List<Comment> comments;
//
//    @OneToMany(mappedBy = "task")
//    private List<TagTask> tagTasks;
}