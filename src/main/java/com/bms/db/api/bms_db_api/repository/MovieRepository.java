package com.bms.db.api.bms_db_api.repository;

import com.bms.db.api.bms_db_api.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface MovieRepository extends JpaRepository<Movie, UUID> {
    Movie findAllById(UUID movieId);
}
