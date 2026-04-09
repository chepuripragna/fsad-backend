package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.klu.model.Discussion;
import com.klu.service.DiscussionService;

@RestController
@RequestMapping("/api/discussions")
@CrossOrigin(origins = "*")
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    // Add discussion
    @PostMapping
    public Discussion addDiscussion(@RequestBody Discussion discussion) {
        return discussionService.addDiscussion(discussion);
    }

    // Get all discussions
    @GetMapping
    public List<Discussion> getAllDiscussions() {
        return discussionService.getAllDiscussions();
    }

    // Get discussions by category
    @GetMapping("/category/{category}")
    public List<Discussion> getByCategory(@PathVariable String category) {
        return discussionService.getByCategory(category);
    }
}