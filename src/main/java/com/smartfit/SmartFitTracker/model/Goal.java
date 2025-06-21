package com.smartfit.SmartFitTracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "goals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goal {
    @Id
    private String id;
    private String userId;
    private String goal;
    private String targetDate;  // You can switch to Date if preferred
}