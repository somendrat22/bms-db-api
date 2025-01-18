package com.bms.db.api.bms_db_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class BookedSeats {
    @Id
    UUID id;
    int rowNum;
    int colNum;
    @ManyToOne
    Hall hall;
    Double bookingStartTime;
    Double bookingEndTime;
}
