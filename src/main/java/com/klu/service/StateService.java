package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.klu.model.State;
import com.klu.repository.StateRepository;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    // Add state
    public State addState(State state) {
        return stateRepository.save(state);
    }

    // Get all states
    public List<State> getAllStates() {
        return stateRepository.findAll();
    }
}