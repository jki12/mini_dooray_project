package com.nhnacademy.mini.dooray.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tag_tasks")
public class TagTask {
    @EmbeddedId
    private Pk pk;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private Task task;
//
//    @Id
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "tag_id")
//    private Tag tag;

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Pk implements Serializable {

    }

    // project_id는 Task와 TagTask 사이의 관계를 나타내는 데 사용되지만,
    // JPA에서는 이러한 형태의 복합 외래 키를 직접 매핑하지 않습니다.
    // 대신 Task 엔티티 내에서 project_id를 관리합니다.
}
