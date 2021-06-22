package com.example.zoobla.repository;

import com.example.zoobla.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Client, Integer> {


    //  List<Client> findByF_name(String f_name);
}

