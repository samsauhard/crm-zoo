package com.example.zoobla.service;

import com.example.zoobla.entity.Advisor;
import com.example.zoobla.entity.Client;
import com.example.zoobla.repository.AdvisorRepository;
import com.example.zoobla.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvisorService {
    @Autowired
    private AdvisorRepository repository;

    public Advisor saveAdvisor(Advisor advisor)
    {
        return repository.save(advisor);
    }
    //----------------------------------------------
    public List<Advisor> saveAdvisors(List<Advisor> advisors)
    {
        return repository.saveAll(advisors);
    }
    //-----------------------------------------------
    public List<Advisor> getAdvisors()
    {
        return repository.findAll();
    }
    //-----------------------------------------------
    public Advisor getAdvisorById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    //------------------------------------------------
    //public List<Client> getCustomerByF_name(String f_name)
    // {
    //    return repository.findByF_name(f_name);
    //  }
    //-------------------------------------------------

    public String deleteAdvisor(int id)
    {
        repository.deleteById(id);
        return "Advisor Removed ||" + id;
    }
    //-------------------------------------------------
    public Advisor updateAdvisor(Advisor advisor)
    {
        Advisor existingAdvisor = repository.findById(advisor.getAdvisor_id()).orElse(null);
        existingAdvisor.setF_name(advisor.getF_name());
        //DO IT FOR ALL THE UPDATED FIELDS
        return repository.save(existingAdvisor);
    }
    //--------------------------------------------------
}
