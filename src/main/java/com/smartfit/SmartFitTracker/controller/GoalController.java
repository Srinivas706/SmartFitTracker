package com.smartfit.SmartFitTracker.controller;

import com.smartfit.SmartFitTracker.model.Goal;
import com.smartfit.SmartFitTracker.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goals")
public class GoalController {

    @Autowired
    private GoalRepository goalRepository;

    @PostMapping
    public Goal addGoal(@RequestBody Goal goal) {
        return goalRepository.save(goal);
    }

    @GetMapping
    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }
}
