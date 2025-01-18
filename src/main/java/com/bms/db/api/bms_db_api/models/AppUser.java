package com.bms.db.api.bms_db_api.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String firstName;
    String lastName;
    @Column(unique = true, nullable = false)
    String email;
    @Column(nullable = false)
    String password;
    String userType;
    @Column(unique = true, nullable = false)
    Long contactNumber;
}
