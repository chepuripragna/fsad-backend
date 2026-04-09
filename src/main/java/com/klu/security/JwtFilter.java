package com.klu.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component; ❌ disabled

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

//@Component ❌ VERY IMPORTANT → disabled
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                   HttpServletResponse response,
                                   FilterChain filterChain)
            throws ServletException, IOException {

        // 🚫 NOT USED RIGHT NOW
        // Just pass everything

        filterChain.doFilter(request, response);
    }
}