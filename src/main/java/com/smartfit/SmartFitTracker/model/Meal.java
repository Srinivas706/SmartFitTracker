package com.smartfit.SmartFitTracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "meals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
    @Id
    private String id;
    private String userId;
    private String mealType;
    private int calories;
    private Date date;
}