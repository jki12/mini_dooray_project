package com.nhnacademy.mini.dooray.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
