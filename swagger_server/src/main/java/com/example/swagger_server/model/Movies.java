package com.example.swagger_server.model;

import java.time.LocalDate;
import java.util.List;


public class Movies {
// titre, réalisateur, acteur principal et date de sortie

    public Movies() {
    }

    public Movies(Integer id, String title, String director, LocalDate dateS, String actor) {
        super();
        this.id = id;
        this.title = title;
        this.director = director;
        this.dateS = dateS;
        this.actor = actor;
    }

    private Integer id;
    private String title;
    private String director;
    private LocalDate dateS;
    private String actor;

    //getters and setters

    @Override
    public String toString() {
        return "Actors [id=" + id + ", tiltle=" + title + ", dirctor=" + director + ", dateS=" + dateS + ", actor=" + actor + "]";
    }


}
