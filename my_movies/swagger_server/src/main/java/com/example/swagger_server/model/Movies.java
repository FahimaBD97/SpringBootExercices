package com.example.swagger_server.model;

import io.swagger.annotations.ApiModelProperty;

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
    @ApiModelProperty(notes = "Class of the Movies",name="id",required=true,value="")
    private Integer id;
    @ApiModelProperty(notes = "Class of the Movies",name="title",required=true,value="")
    private String title;
    @ApiModelProperty(notes = "Class of the Movies",name="director",required=true,value="")
    private String director;
    @ApiModelProperty(notes = "Class of the Movies",name="dateS",required=true,value="")
    private LocalDate dateS;
    @ApiModelProperty(notes = "Class of the Movies",name="actor",required=true,value="")
    private String actor;

    //getters and setters

    public String gettitle() {
        return title ;
    }
    @Override
    public String toString() {
        return "Actors [id=" + id + ", tiltle=" + title + ", dirctor=" + director + ", dateS=" + dateS + ", actor=" + actor + "]";
    }



}
