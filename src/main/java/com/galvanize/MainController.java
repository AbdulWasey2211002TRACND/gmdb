package com.galvanize;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.gmdb.gmdb.Movies;
import com.galvanize.gmdb.gmdb.MoviesRepository;


@RestController
public class MainController {

    @Autowired
    private MoviesRepository movie;

    @GetMapping("/movies")
    public List<Movies> getmovies() {

        return movie.findAll();
    }

    @PostMapping("/post_course")
    public String postmovies(Movies movies) {

        Movies check = movie.save(movies);
        return "Movie Added";
    }


}


