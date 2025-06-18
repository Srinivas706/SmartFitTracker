package com.smartfit.SmartFitTracker.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "workouts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workout {
    @Id
    private String id;
    private String userId;
    private String type;
    private int durationMins;
    private int caloriesBurned;
    private Date date;
}
