package com.nhnacademy.mini.dooray.entity;

import com.nhnacademy.mini.dooray.domain.RoleType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "task_users")
public class TaskUser {
    @EmbeddedId
    private Pk pk;

    @MapsId("taskId")
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Column(name = "task_user_role")
    private RoleType taskUserRole;

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Pk implements Serializable {
        @Column(name = "user_id")
        private String userId;

        @Column(name = "task_id")
        private Long taskId;
    }
}
