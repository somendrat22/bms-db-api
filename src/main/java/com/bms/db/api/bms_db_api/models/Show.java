package com.bms.db.api.bms_db_api.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    int showPrice;
    @ManyToOne
    Movie movie;
    Double showStartTime;
    Double showEndTime;
    @ManyToOne
    Hall hall;
}
