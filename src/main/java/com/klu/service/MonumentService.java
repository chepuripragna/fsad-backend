package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.klu.model.Monument;
import com.klu.repository.MonumentRepository;

@Service
public class MonumentService {

    @Autowired
    private MonumentRepository monumentRepository;

    // Add monument
    public Monument addMonument(Monument monument) {
        return monumentRepository.save(monument);
    }

    // Get all monuments
    public List<Monument> getAllMonuments() {
        return monumentRepository.findAll();
    }

    // Get monuments by state
    public List<Monument> getByState(String state) {
        return monumentRepository.findByState(state);
    }
    
}