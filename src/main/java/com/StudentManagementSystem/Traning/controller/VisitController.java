package com.StudentManagementSystem.Traning.controller;

import com.StudentManagementSystem.Traning.model.Visit;
import com.StudentManagementSystem.Traning.reposatory.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    private VisitRepository visitRepository;

    // Adding a new visit (POST request)
    @PostMapping
    public Visit newVisit(@RequestBody Visit visit) {
        return visitRepository.save(visit);
    }

    // Showing all visits (GET request)
    @GetMapping
    public List<Visit> getAllVisits() {
        return visitRepository.findAll();
    }
}