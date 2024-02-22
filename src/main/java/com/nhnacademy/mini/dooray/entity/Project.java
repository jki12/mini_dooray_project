package com.nhnacademy.mini.dooray.entity;

import com.nhnacademy.mini.dooray.domain.StateType;
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

    @Column(name = "project_state")
    private StateType projectState;
}