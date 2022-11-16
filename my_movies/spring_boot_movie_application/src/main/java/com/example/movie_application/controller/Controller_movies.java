package com.example.movie_application.controller;
import com.example.swagger_server.model.Movies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controller_movies {

    List<Movies> Movies = new ArrayList<Movies>();

    {
        Movies.add(new Movies(1, "film1", "director1", 01, "actor1"));
        Movies.add(new Movies(2, "film2", "director2", 01, "actor2"));
        Movies.add(new Movies(3, "film3", "director3", 01, "actor3"));
        Movies.add(new Movies(4, "film4", "director4", 01, "actor4"));
    }

    @RequestMapping(value = "/getMovies")
    public List<Movies> getMovies() {
        return Movies;
    }

    @RequestMapping(value = "/getMovies/{title}")
    public Movies getMovies(@PathVariable(value = "title") String title) {
        return Movies.stream().filter(x -> x.gettitle().equalsIgnoreCase(title)).collect(Collectors.toList()).get(0);
    }


}