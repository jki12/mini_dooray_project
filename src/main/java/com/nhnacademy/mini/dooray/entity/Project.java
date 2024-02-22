package com.nhnacademy.mini.dooray.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "project_name", length = 32)
    private String projectName;

    @ManyToOne
    @JoinColumn(name = "project_state_id")
    private State state;
}