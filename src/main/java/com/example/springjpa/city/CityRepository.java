package com.example.springjpa.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface CityRepository extends JpaRepository<City, UUID> {
    Optional<City> findByCityName(String name);
}
