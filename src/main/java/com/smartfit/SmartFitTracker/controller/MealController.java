package com.smartfit.SmartFitTracker.controller;

import com.smartfit.SmartFitTracker.model.Meal;
import com.smartfit.SmartFitTracker.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealRepository mealRepository;

    @PostMapping
    public Meal createMeal(@RequestBody Meal meal) {
        return mealRepository.save(meal);
    }

    @GetMapping
    public String getAllMeals(Model model) {
        List<Meal> meals = mealRepository.findAll();
        model.addAttribute("meals", meals);
        return "meals";
    }
}
