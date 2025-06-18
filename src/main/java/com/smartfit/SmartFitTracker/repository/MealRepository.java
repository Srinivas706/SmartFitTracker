package com.smartfit.SmartFitTracker.repository;

import com.smartfit.SmartFitTracker.model.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MealRepository extends MongoRepository<Meal, String> {
}
