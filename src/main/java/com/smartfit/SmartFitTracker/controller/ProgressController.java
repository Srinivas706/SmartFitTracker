package com.smartfit.SmartFitTracker.controller;

import com.smartfit.SmartFitTracker.model.Progress;
import com.smartfit.SmartFitTracker.repository.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/progress")
public class ProgressController {

    @Autowired
    private ProgressRepository progressRepository;

    @PostMapping
    public Progress createProgress(@RequestBody Progress progress) {
        return progressRepository.save(progress);
    }

    @GetMapping
    public String getAllProgress(Model model) {
        List<Progress> progressEntries = progressRepository.findAll();
        model.addAttribute("progressEntries", progressEntries);
        return "progress";
    }
}
