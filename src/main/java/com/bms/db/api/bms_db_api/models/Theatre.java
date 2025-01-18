package com.bms.db.api.bms_db_api.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String theaterName;
    String theaterLoc;
    @ManyToOne
    AppUser owner;
}
