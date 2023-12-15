package com.example.springjpa.state;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface StateRepository extends JpaRepository<State, UUID> {
    Optional<State> findByStateName(String name);
}
