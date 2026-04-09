package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.klu.model.State;
import com.klu.service.StateService;

@RestController
@RequestMapping("/api/states")
@CrossOrigin(origins = "*")
public class StateController {

    @Autowired
    private StateService stateService;

    // Add state (Admin)
    @PostMapping
    public State addState(@RequestBody State state) {
        return stateService.addState(state);
    }

    // Get all states
    @GetMapping
    public List<State> getAllStates() {
        return stateService.getAllStates();
    }
}