package com.smartfit.SmartFitTracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "progress")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Progress {
    @Id
    private String id;
    private String userId;
    private double weight;
    private double bmi;
    private Date date;
}