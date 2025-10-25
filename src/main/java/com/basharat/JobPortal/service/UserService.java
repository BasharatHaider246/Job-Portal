package com.basharat.JobPortal.service;


import com.basharat.JobPortal.model.User;
import java.util.Optional;

public interface UserService {
    // Method to register a new user
    User registerUser(User user);

    // Method to find a user by their ID
    Optional<User> findById(Long id);

    // Method to find a user by their username
    User findByUsername(String username);

    // Method to find a user by their email
    User findByEmail(String email);
}
