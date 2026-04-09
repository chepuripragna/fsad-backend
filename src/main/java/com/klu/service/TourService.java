package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.klu.model.Tour;
import com.klu.repository.TourRepository;

@Service
public class TourService {

    @Autowired
    private TourRepository tourRepository;

    // Add tour
    public Tour addTour(Tour tour) {
        return tourRepository.save(tour);
    }

    // Get tours by monument
    public List<Tour> getToursByMonument(Long monumentId) {
        return tourRepository.findByMonumentId(monumentId);
    }
}