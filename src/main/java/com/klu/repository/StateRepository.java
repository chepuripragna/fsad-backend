package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.model.State;

public interface StateRepository extends JpaRepository<State, Long> {
}