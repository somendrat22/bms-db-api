package com.bms.db.api.bms_db_api.controller;

import com.bms.db.api.bms_db_api.models.AppUser;
import com.bms.db.api.bms_db_api.models.Hall;
import com.bms.db.api.bms_db_api.repository.AppUserRepository;
import com.bms.db.api.bms_db_api.repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/db/hall")
public class HallController {

    HallRepository hallRepository;

    @Autowired
    public HallController(HallRepository hallRepository){
        this.hallRepository = hallRepository;
    }

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody Hall hall){
        this.hallRepository.save(hall);
        return new ResponseEntity(hall, HttpStatus.CREATED);
    }

}
