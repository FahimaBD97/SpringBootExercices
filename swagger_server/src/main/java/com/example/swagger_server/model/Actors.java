package com.example.swagger_server.model;
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

        private Integer id;
        private String firstName;
        private String lastName;
        private LocalDate dateN;
        private String movies ;

        //getters and setters

        @Override
        public String toString() {
            return "Actors [id=" + id + ", firstName=" + firstName             + ", lastName=" + lastName + ", dateN=" + dateN + ", movies="+ movies +"]";    }
    }

