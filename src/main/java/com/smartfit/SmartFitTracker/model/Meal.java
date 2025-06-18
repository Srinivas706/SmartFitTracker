package com.smartfit.SmartFitTracker.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "meals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meal {
    @Id
    private String id;
    private String userId;
    private String mealType;
    private int calories;
    private Date date;
}
