package com.smartfit.SmartFitTracker.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "goals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goal {
    @Id
    private String id;
    private String userId;
    private String goal;
    private String targetDate;  // Optional: you can also use Date if you prefer
}
