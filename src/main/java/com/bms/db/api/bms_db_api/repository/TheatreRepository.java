package com.bms.db.api.bms_db_api.repository;

import com.bms.db.api.bms_db_api.models.Show;
import com.bms.db.api.bms_db_api.models.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, UUID> {
}
