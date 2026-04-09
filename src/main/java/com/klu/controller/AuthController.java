package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klu.model.User;
import com.klu.service.UserService;
import com.klu.security.JwtUtil;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    // ✅ Register
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        User savedUser = userService.register(user);
        return ResponseEntity.ok(savedUser);
    }

    // ✅ Login → returns JWT token
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {

        System.out.println("EMAIL FROM REQUEST: " + user.getEmail());
        System.out.println("PASSWORD FROM REQUEST: " + user.getPassword());

        User validUser = userService.login(user.getEmail(), user.getPassword());

        if (validUser != null) {

            String token = jwtUtil.generateToken(
                    validUser.getEmail(),
                    validUser.getRole().name()
            );

            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}