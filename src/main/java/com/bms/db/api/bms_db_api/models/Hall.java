package com.bms.db.api.bms_db_api.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String hallName;
    @ManyToOne
    Theatre theatre;
    int totalRows;
    int totalCols;
}
