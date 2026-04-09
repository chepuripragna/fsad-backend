package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.klu.model.Comment;
import com.klu.repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    // Add comment
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    // Get comments by discussion
    public List<Comment> getCommentsByDiscussion(Long discussionId) {
        return commentRepository.findByDiscussionId(discussionId);
    }
}