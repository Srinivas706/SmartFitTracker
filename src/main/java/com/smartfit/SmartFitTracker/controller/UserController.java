package com.smartfit.SmartFitTracker.controller;

import com.smartfit.SmartFitTracker.model.User;
import com.smartfit.SmartFitTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 👇 Add this below
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PostMapping
    public User createUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(updatedUser.getName());
                    user.setEmail(updatedUser.getEmail());
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
        return "User deleted successfully";
    }
}
