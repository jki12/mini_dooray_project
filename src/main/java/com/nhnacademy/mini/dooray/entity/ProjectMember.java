package com.nhnacademy.mini.dooray.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "project_members")
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

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

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