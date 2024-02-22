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
@Table(name = "project_users")
public class ProjectMember {
    @EmbeddedId
    private Pk pk;

    @MapsId("userId")
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @MapsId("projectId")
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "project_user_role")
    private RoleType projectUserRole;

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Pk implements Serializable {
        @Column(name = "user_id")
        private String userId;

        @Column(name = "project_id")
        private Long projectId;
    }
}