package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.klu.model.Role;
import org.springframework.stereotype.Service;

import com.klu.model.User;
import com.klu.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register user
    public User register(User user) {

        // 🔥 prevent duplicate email
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }

        // 🔥 default role
        user.setRole(Role.USER);

        return userRepository.save(user);
    }

    // Login user
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);

        System.out.println("INPUT EMAIL: " + email);
        System.out.println("INPUT PASSWORD: " + password);

        if (user != null) {
            System.out.println("DB EMAIL: " + user.getEmail());
            System.out.println("DB PASSWORD: " + user.getPassword());
        } else {
            System.out.println("USER NOT FOUND");
        }

        if (user != null && user.getPassword().equals(password)) {
            System.out.println("LOGIN SUCCESS");
            return user;
        }

        System.out.println("LOGIN FAILED");
        return null;
    }
}