package com.galvanize.gmdb.gmdb;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Title;
    private String Genre;
    private int YearOfRelease;
    private long Runtime;
    private long id;




    public Movies(String title, String genre, int yearOfRelease, long runtime, long id) {
        this.Title = title;
        this.Genre = genre;
        this.YearOfRelease = yearOfRelease;
        this.Runtime = runtime;
        this.id = id;
    }


    protected Movies(){}

    @Override
    public String toString() {
        return "Movie [ID = " + id + ", Title = " + Title + ", Genre = " + Genre + ", Year of release =" + YearOfRelease + ", Runtime =" + Runtime + "]" ;
    }




    public String getTitle() {
        return Title;
    }





    public String getGenre() {
        return Genre;
    }





    public int getYearOfRelease() {
        return YearOfRelease;
    }





    public long getRuntime() {
        return Runtime;
    }




    public long getId() {
        return id;
    }






}
