package com.smartfit.SmartFitTracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "progress")
public class Progress {
    @Id
    private String id;
    private String userId;
    private double weight;
    private double bmi;
    private Date date;

    // No-args constructor
    public Progress() {
    }

    // All-args constructor
    public Progress(String id, String userId, double weight, double bmi, Date date) {
        this.id = id;
        this.userId = userId;
        this.weight = weight;
        this.bmi = bmi;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}