package com.nhnacademy.mini.dooray.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
@Table(name = "state")
public class State {

    @Id
    @Column(name = "state_id")
    private Long stateId;

    @Column(name = "state_name")
    private String stateName;

}