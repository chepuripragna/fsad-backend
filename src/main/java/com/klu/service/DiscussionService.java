package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.klu.model.Discussion;
import com.klu.repository.DiscussionRepository;

@Service
public class DiscussionService {

    @Autowired
    private DiscussionRepository discussionRepository;

    // Add discussion
    public Discussion addDiscussion(Discussion discussion) {
        return discussionRepository.save(discussion);
    }

    // Get all discussions
    public List<Discussion> getAllDiscussions() {
        return discussionRepository.findAll();
    }

    // Get by category
    public List<Discussion> getByCategory(String category) {
        return discussionRepository.findByCategory(category);
    }
}