package com.nhnacademy.mini.dooray.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "state")
public class State {

    @Id
    @Column(name = "state_id")
    private Long stateId;

    @Column(name = "state_name")
    private String stateName;

    @OneToMany(mappedBy = "state")
    private List<Project> projects;

    @OneToMany(mappedBy = "state")
    private List<Task> tasks;
}