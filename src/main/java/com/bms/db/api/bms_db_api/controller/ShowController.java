package com.bms.db.api.bms_db_api.controller;

import com.bms.db.api.bms_db_api.models.Show;
import com.bms.db.api.bms_db_api.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/db/show")
public class ShowController {

    ShowRepository showRepository;

    @Autowired
    public ShowController(ShowRepository showRepository){
        this.showRepository = showRepository;
    }

    @PostMapping("/createShow")
    public ResponseEntity createShow(@RequestBody Show show){
        showRepository.save(show);
        return new ResponseEntity(show, HttpStatus.CREATED);
    }

    @PutMapping("/updateShow")
    public ResponseEntity updateShow(@RequestBody Show show){
        showRepository.save(show);
        return new ResponseEntity(show, HttpStatus.OK);
    }

    @GetMapping("/viewAllShows")
    public ResponseEntity viewAllShows(){
        List<Show> shows = showRepository.findAll();
        return new ResponseEntity<>(shows,HttpStatus.OK);
    }

}
