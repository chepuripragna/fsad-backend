package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.klu.model.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {

    List<Tour> findByMonumentId(Long monumentId);
}