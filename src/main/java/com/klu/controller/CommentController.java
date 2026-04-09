package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.klu.model.Comment;
import com.klu.service.CommentService;

@RestController
@RequestMapping("/api/comments")
@CrossOrigin(origins = "*")
public class CommentController {

    @Autowired
    private CommentService commentService;

    // Add comment
    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    // Get comments by discussion
    @GetMapping("/{discussionId}")
    public List<Comment> getCommentsByDiscussion(@PathVariable Long discussionId) {
        return commentService.getCommentsByDiscussion(discussionId);
    }
}