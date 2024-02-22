package com.nhnacademy.mini.dooray.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "tag_tasks")
//@IdClass(TagTaskId.class) // 복합 키를 위한 IdClass 지정
public class TagTask {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private Task task;
//
//    @Id
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "tag_id")
//    private Tag tag;

    // project_id는 Task와 TagTask 사이의 관계를 나타내는 데 사용되지만,
    // JPA에서는 이러한 형태의 복합 외래 키를 직접 매핑하지 않습니다.
    // 대신 Task 엔티티 내에서 project_id를 관리합니다.
}
