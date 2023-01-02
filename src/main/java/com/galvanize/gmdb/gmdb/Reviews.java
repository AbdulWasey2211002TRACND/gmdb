package com.galvanize.gmdb.gmdb;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ReviewText;
    private long MovieID;
    private long id;



    public Reviews(String ReviewText, long MovieID, long id) {
        this.ReviewText = ReviewText;
        this.MovieID = MovieID;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Review [ID = " + id + ", Review = " + ReviewText + ", MovieID = " + MovieID + "]" ;
    }



    public String getReviewText() {
        return ReviewText;
    }
    public long getMovieID() {
        return MovieID;
    }
    public long getId() {
        return id;
    }




}
