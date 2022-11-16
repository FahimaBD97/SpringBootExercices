package com.example.movie_application.controller;

import com.example.swagger_server.model.Actors;
import com.example.swagger_server.model.Movies;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Controller_actors {





@RestController
    List<Actors> Actors= new ArrayList<Actors>();

    {
            Actors.add(new Actors(2 ,"Morgan  ", "Freeman" ,"" ,"Shawshank"));
            Actors.add(new Actors(2 ,"acteur1  ", "acteur" ,"" ,"film1"));

    }

    @RequestMapping(value = "/getActors")
    public List<Actors> getActors() {
        return Actors;
    }

    @RequestMapping(value = "/getActors/{lastName}")
    public  Actors getActors(@PathVariable(value = "lastName") String lastName) {
        return Actors.stream().filter(x -> x.getlastName().equalsIgnoreCase(lastName)).collect(Collectors.toList()).get(0);
    }


}