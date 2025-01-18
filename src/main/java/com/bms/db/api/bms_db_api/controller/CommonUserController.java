package com.bms.db.api.bms_db_api.controller;

import com.bms.db.api.bms_db_api.models.AppUser;
import com.bms.db.api.bms_db_api.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/db/user")
public class CommonUserController {

    AppUserRepository appUserRepository;

    @Autowired
    public CommonUserController(AppUserRepository appUserRepository){
        this.appUserRepository = appUserRepository;
    }

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody AppUser user){
        this.appUserRepository.save(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }

}
