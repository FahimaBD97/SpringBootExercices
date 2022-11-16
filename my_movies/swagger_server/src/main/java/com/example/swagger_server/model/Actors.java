package com.example.swagger_server.model;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;


    public class Actors {

        public Actors() {            }
        public Actors(Integer id, String firstName, String lastName, LocalDate dateN ,  String movies)  {
            super();
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateN = dateN ;
            this.movies = movies;    }

        @ApiModelProperty(notes = "Class of the Movies",name="id",required=true,value="")
        private Integer id;
        @ApiModelProperty(notes = "Class of the Movies",name="firstName",required=true,value="")
        private String firstName;
        @ApiModelProperty(notes = "Class of the Movies",name="lastName",required=true,value="")
        private String lastName;
        @ApiModelProperty(notes = "Class of the Movies",name="dateN",required=true,value="")
        private LocalDate dateN;
        @ApiModelProperty(notes = "Class of the Movies",name="movies",required=true,value="")
        private String movies ;


        //getters and setters

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return "Actors [id=" + id + ", firstName=" + firstName             + ", lastName=" + lastName + ", dateN=" + dateN + ", movies="+ movies +"]";    }
    }

