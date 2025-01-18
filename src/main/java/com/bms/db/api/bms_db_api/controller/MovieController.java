package com.bms.db.api.bms_db_api.controller;

import com.bms.db.api.bms_db_api.models.Movie;
import com.bms.db.api.bms_db_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/movie")
public class MovieController {

    MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @PostMapping("createMovie")
    public ResponseEntity createMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
        return new ResponseEntity(movie, HttpStatus.CREATED);
    }

    @GetMapping("viewMovie")
    public ResponseEntity viewMovie(@RequestParam UUID movieId){
        Movie movie = movieRepository.findAllById(movieId);
        return new ResponseEntity(movie, HttpStatus.CREATED);
    }
}
