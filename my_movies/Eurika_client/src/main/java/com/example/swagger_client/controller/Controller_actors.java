package com.example.swagger_server.controller;

import com.example.swagger_server.model.Actors;
import com.example.swagger_server.model.Movies;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Api(value = "Controller_actors", description = "REST APIs Movies")
@RestController

public class Controller_actors {

    @RestController

    List<Movies> Actors= new ArrayList<Actors>();

    {
            Actors.add(new Actors(2 ,"Morgan  ", "Freeman" ,"" ,"Shawshank"));
            Actors.add(new Actors(2 ,"acteur1  ", "acteur" ,"" ,"film1"));

    }
    @ApiOperation(value = "Get Actors ", response = Actors.class, tags = "getActors")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })


    @RequestMapping(value = "/getActors")
    public List<Actors> getActors() {
        return Actors;
    }


    @ApiOperation(value = "Get Actors ", response = Actors.class, tags = "getActors")
    @RequestMapping(value = "/getActors/{lastName}")
    public Movies getActors(@PathVariable(value = "lastName") String lastName) {
        return Actors.stream().filter(x -> x.gettitle().equalsIgnoreCase(lastName)).collect(Collectors.toList()).get(0);
    }


}