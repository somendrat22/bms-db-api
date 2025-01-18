package com.bms.db.api.bms_db_api.controller;

import com.bms.db.api.bms_db_api.models.BookedSeats;
import com.bms.db.api.bms_db_api.repository.BookedSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/user/bookedSeat")
public class BookedSeatController {

    BookedSeatRepository bookedSeatRepository;

    @Autowired
    public BookedSeatController(BookedSeatRepository bookedSeatRepository){
        this.bookedSeatRepository = bookedSeatRepository;
    }

    @PostMapping("/bookSeat")
    public ResponseEntity bookSeat(@RequestBody BookedSeats bookedSeats){
        bookedSeatRepository.save(bookedSeats);
        return new ResponseEntity(bookedSeats, HttpStatus.CREATED);
    }

    @PostMapping("/deleteSeat")
    public ResponseEntity deleteSeat(@RequestBody BookedSeats bookedSeats){
        bookedSeatRepository.delete(bookedSeats);
        return new ResponseEntity(bookedSeats, HttpStatus.OK);
    }

}
