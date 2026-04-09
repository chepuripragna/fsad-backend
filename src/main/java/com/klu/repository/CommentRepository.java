package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.klu.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByDiscussionId(Long discussionId);
}