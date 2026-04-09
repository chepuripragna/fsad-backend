package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.klu.model.Monument;

public interface MonumentRepository extends JpaRepository<Monument, Long> {

    List<Monument> findByState(String state);
}