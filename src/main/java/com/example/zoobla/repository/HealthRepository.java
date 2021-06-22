package com.example.zoobla.repository;

import com.example.zoobla.entity.Health;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRepository extends JpaRepository<Health, Integer> {

}
