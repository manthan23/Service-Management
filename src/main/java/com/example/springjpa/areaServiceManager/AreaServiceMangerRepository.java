package com.example.springjpa.areaServiceManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface AreaServiceMangerRepository extends JpaRepository<AreaServiceManager, UUID> {
    Optional<AreaServiceManager> findByEmail(String email);
}
