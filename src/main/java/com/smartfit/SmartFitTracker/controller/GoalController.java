package com.smartfit.SmartFitTracker.controller;

import com.smartfit.SmartFitTracker.model.Goal;
import com.smartfit.SmartFitTracker.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/goals")
public class GoalController {

    @Autowired
    private GoalRepository goalRepository;

    @PostMapping
    public Goal createGoal(@RequestBody Goal goal) {
        return goalRepository.save(goal);
    }

    @GetMapping
    public String getAllGoals(Model model) {
        List<Goal> goals = goalRepository.findAll();
        model.addAttribute("goals", goals);
        return "goals";
    }
}
