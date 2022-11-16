package com.example.swagger_server.controller;

import com.example.swagger_server.model.Actors;
import com.example.swagger_server.model.Movies;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class Controller_actors {




        @RequestMapping("/")
        public List<Actors> getActors()
        {
            List<Actors> ActorsList = new ArrayList<Actors>();
            ActorsList.add(new Actors(2 ,"Morgan  ", "Freeman" ,"" ,"Shawshank");

            return ActorsList;
        }
    }

