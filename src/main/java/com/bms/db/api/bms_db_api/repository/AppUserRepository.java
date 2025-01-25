package com.bms.db.api.bms_db_api.repository;

import com.bms.db.api.bms_db_api.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {

    public AppUser findByEmail(String email);
}
