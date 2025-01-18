package com.bms.db.api.bms_db_api.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String director;
    Double duration;
    LocalDateTime releaseDate;
    Double rating;
    int totalVotes;
    String description;
    @ManyToOne
    AppUser movieOwner;
}
