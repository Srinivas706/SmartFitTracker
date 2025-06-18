package com.smartfit.SmartFitTracker.controller;

import com.smartfit.SmartFitTracker.model.Progress;
import com.smartfit.SmartFitTracker.repository.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {

    @Autowired
    private ProgressRepository progressRepository;

    @PostMapping
    public Progress addProgress(@RequestBody Progress progress) {
        return progressRepository.save(progress);
    }

    @GetMapping
    public List<Progress> getAllProgress() {
        return progressRepository.findAll();
    }
}
