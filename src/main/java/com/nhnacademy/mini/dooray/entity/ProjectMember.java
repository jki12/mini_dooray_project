package com.nhnacademy.mini.dooray.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "project_members")
public class ProjectMember {

//    @Id
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "project_id")
//    private Project project;
//
//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private Role role;
}