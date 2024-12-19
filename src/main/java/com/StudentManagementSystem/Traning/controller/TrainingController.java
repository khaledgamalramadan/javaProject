package com.StudentManagementSystem.Traning.controller;

import com.StudentManagementSystem.Traning.model.Training;
import com.StudentManagementSystem.Traning.reposatory.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainingController {

    @Autowired
    private TrainingRepository trainingRepository;

    // إضافة تدريب جديد
    @PostMapping("/training")
    public Training newTraining(@RequestBody Training training) {
        return trainingRepository.save(training);
    }

    // عرض جميع التدريبات
    @GetMapping("/trainings")
    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }
}
