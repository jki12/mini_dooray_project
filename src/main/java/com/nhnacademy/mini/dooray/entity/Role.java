package com.nhnacademy.mini.dooray.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

}