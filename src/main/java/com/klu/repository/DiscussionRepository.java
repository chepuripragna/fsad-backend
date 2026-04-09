package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.klu.model.Discussion;

public interface DiscussionRepository extends JpaRepository<Discussion, Long> {

    List<Discussion> findByCategory(String category);
}