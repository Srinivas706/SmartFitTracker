package com.smartfit.SmartFitTracker.repository;

import com.smartfit.SmartFitTracker.model.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepository extends MongoRepository<Goal, String> {
}
