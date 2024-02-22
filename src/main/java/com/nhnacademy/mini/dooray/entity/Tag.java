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
@Table(name = "tags")
public class Tag {
    @Id
    @Column(name = "tag_id")
    private Long tagId;

    @Column(name = "tag_name")
    private String tagName;
}
