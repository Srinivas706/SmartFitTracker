package com.smartfit.SmartFitTracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "meals")
public class Meal {
    @Id
    private String id;
    private String userId;
    private String mealType;
    private int calories;
    private Date date;

    // No-args constructor
    public Meal() {
    }

    // All-args constructor
    public Meal(String id, String userId, String mealType, int calories, Date date) {
        this.id = id;
        this.userId = userId;
        this.mealType = mealType;
        this.calories = calories;
        this.date = date;
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

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}