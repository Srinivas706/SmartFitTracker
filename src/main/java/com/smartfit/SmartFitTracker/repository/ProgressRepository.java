package com.smartfit.SmartFitTracker.repository;

import com.smartfit.SmartFitTracker.model.Progress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProgressRepository extends MongoRepository<Progress, String> {
}
