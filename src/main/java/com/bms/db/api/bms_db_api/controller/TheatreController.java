package com.bms.db.api.bms_db_api.controller;

import com.bms.db.api.bms_db_api.models.Theatre;
import com.bms.db.api.bms_db_api.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/theatre")
public class TheatreController {

    TheatreRepository theatreRepository;

    @Autowired
    public TheatreController(TheatreRepository theatreRepository){
        this.theatreRepository = theatreRepository;
    }

    @PostMapping("/create")
    public ResponseEntity createTheatre(@RequestBody Theatre theatre){
        theatreRepository.save(theatre);
        return new ResponseEntity(theatre, HttpStatus.CREATED);
    }

    @PostMapping("/deleteTheatre")
    public ResponseEntity deleteTheatre(@RequestBody Theatre theatre){
        theatreRepository.delete(theatre);
        return new ResponseEntity(theatre, HttpStatus.OK);
    }

    @GetMapping("/viewAllTheathre")
    public ResponseEntity viewAllTheathre(String location){
        List<Theatre> theatres = theatreRepository.findAll();
        return new ResponseEntity<>(theatres,HttpStatus.OK);
    }
}
