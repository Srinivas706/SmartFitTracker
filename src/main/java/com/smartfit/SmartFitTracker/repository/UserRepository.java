package com.smartfit.SmartFitTracker.repository;

import com.smartfit.SmartFitTracker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
