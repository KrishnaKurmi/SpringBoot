package com.second.secondbatchVeer.movie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movies {
    @Id
    int movieid;
    String moviename,genre;

    public Movies() {
    }

    public Movies(int movieid, String moviename, String genre) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.genre = genre;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
