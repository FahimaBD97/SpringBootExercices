package com.example.swagger_server.controller;
import com.example.swagger_server.model.Actors;
import com.example.swagger_server.model.Movies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controller_movies {

    List<Movies> Movies = new ArrayList<Movies>();

    {
        Movies.add(new Movies(1, "film1", "director1", 01-12-1997, "actor1"));
        Movies.add(new Movies(2, "film2", "director2", 01-12-1999, "actor2"));
        Movies.add(new Movies(3, "film3", "director3", 01-01-2001, "actor3"));
        Movies.add(new Movies(4, "film4", "director4", 01-02-2002, "actor4"));
    }


    @ApiOperation(value = "Get Movies ", response = Actors.class, tags = "getMovies")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })


    @RequestMapping(value = "/getMovies")
    public List<Movies> getMovies() {
        return Movies;
    }

    @ApiOperation(value = "Get Movies ", response = Actors.class, tags = "getMovies")
    @RequestMapping(value = "/getMovies/{title}")
    public Movies getMovies(@PathVariable(value = "title") String title) {
        return Movies.stream().filter(x -> x.gettitle().equalsIgnoreCase(title)).collect(Collectors.toList()).get(0);
    }


}