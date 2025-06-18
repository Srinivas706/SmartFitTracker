package com.smartfit.SmartFitTracker.controller;

import com.smartfit.SmartFitTracker.model.Meal;
import com.smartfit.SmartFitTracker.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealRepository mealRepository;

    @PostMapping
    public Meal addMeal(@RequestBody Meal meal) {
        return mealRepository.save(meal);
    }

    @GetMapping
    public List<Meal> getMeals() {
        return mealRepository.findAll();
    }
}
