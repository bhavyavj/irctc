package com.irctc.irctc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MyController {
    @Autowired
    //private CourseService courseService;
    @GetMapping("/home")
    public String home(){
        return "Welcome to IRCTC";
    }

}
