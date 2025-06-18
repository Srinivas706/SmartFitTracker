package com.smartfit.SmartFitTracker.repository;

import com.smartfit.SmartFitTracker.model.Workout;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkoutRepository extends MongoRepository<Workout, String> {
}
