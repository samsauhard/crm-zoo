package com.example.zoobla.service;
import com.example.zoobla.entity.Health;
import com.example.zoobla.repository.HealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthService {
    @Autowired
    private HealthRepository repository;

    public Health saveHealth(Health health)
    {
        return repository.save(health);
    }
    //----------------------------------------------
    public List<Health> saveHealths(List<Health> healths)
    {
        return repository.saveAll(healths);
    }
    //-----------------------------------------------
    public List<Health> getHealths()
    {
        return repository.findAll();
    }
    //-----------------------------------------------
    public Health getHealthById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    //------------------------------------------------
    //public List<Client> getCustomerByF_name(String f_name)
    // {
    //    return repository.findByF_name(f_name);
    //  }
    //-------------------------------------------------

    public String deleteHealth(int id)
    {
        repository.deleteById(id);
        return "Health Data Removed ||" + id;
    }
    //-------------------------------------------------
    public Health updateHealth(Health health)
    {
        Health existingHealth = repository.findById(health.getHealth_id()).orElse(null);
        existingHealth.setHealth_issue_description(health.getHealth_issue_description());
        //DO IT FOR ALL THE UPDATED FIELDS
        return repository.save(existingHealth);
    }
    //--------------------------------------------------
}
