package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.klu.model.Tour;
import com.klu.service.TourService;

@RestController
@RequestMapping("/api/tours")
@CrossOrigin(origins = "*")
public class TourController {

    @Autowired
    private TourService tourService;

    // Add tour (Guide)
    @PostMapping
    public Tour addTour(@RequestBody Tour tour) {
        return tourService.addTour(tour);
    }

    // Get tours by monument
    @GetMapping("/{monumentId}")
    public List<Tour> getToursByMonument(@PathVariable Long monumentId) {
        return tourService.getToursByMonument(monumentId);
    }
}