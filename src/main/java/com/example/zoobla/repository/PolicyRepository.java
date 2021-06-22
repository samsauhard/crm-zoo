package com.example.zoobla.repository;

import com.example.zoobla.entity.PolicyInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<PolicyInfo, Integer> {
}
