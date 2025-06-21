package com.smartfit.SmartFitTracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "goals")
public class Goal {
    @Id
    private String id;
    private String userId;
    private String goal;
    private String targetDate;  // You can switch to Date if preferred

    // No-args constructor
    public Goal() {
    }

    // All-args constructor
    public Goal(String id, String userId, String goal, String targetDate) {
        this.id = id;
        this.userId = userId;
        this.goal = goal;
        this.targetDate = targetDate;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }
}