package com.example.swagger_server.controller;
import com.example.swagger_server.model.Movies;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller_movies


    {
        @RequestMapping("/")
        public List<Movies> getEmployees()
        {
            List<Movies> employeesList = new ArrayList<Movies>();
            employeesList.add(new Movies(1,"Shawshank","Frank Dartboard",, "Morgan Freeman"));
            return employeesList;
        }
    }