package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.klu.model.Monument;
import com.klu.service.MonumentService;

@RestController
@RequestMapping("/api/monuments")
@CrossOrigin(origins = "*")
public class MonumentController {

    @Autowired
    private MonumentService monumentService;

    // Add monument (Admin / Creator)
    @PostMapping
    public Monument addMonument(@RequestBody Monument monument) {
        return monumentService.addMonument(monument);
    }

    // Get all monuments
    @GetMapping
    public List<Monument> getAllMonuments() {
        return monumentService.getAllMonuments();
    }

    // Get monuments by state
    @GetMapping("/state/{state}")
    public List<Monument> getByState(@PathVariable String state) {
        return monumentService.getByState(state);
    }

}