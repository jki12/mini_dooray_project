package com.nhnacademy.mini.dooray.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "milestone")
public class Milestone {

    @Id
    @Column(name = "milestone_id")
    private Long milestoneId;

    @Column(name = "milestone_name")
    private String milestoneName;
}
