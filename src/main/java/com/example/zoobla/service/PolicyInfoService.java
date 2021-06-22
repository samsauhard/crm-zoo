package com.example.zoobla.service;

import com.example.zoobla.entity.Client;
import com.example.zoobla.entity.PolicyInfo;
import com.example.zoobla.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.Policy;
import java.util.List;

@Service
public class PolicyInfoService {
    @Autowired
    private PolicyRepository repository;

    public PolicyInfo savePolicy(PolicyInfo policy)
    {
        return repository.save(policy);
    }
    //--------------------------------------------
    public List<PolicyInfo> savePolicies(List<PolicyInfo> policies)
    {
        return repository.saveAll(policies);
    }
    //--------------------------------------------
    public List<PolicyInfo> getPolicies()
    {
        return repository.findAll();
    }
    //---------------------------------------------
    public PolicyInfo getPolicyById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    //----------------------------------------------
    //public List<Client> getCustomerByF_name(String f_name)
    // {
    //    return repository.findByF_name(f_name);
    //  }
    //-----------------------------------------------
    public String deletePolicy(int id)
    {
        repository.deleteById(id);
        return "Policy Removed ||" + id;
    }
    public PolicyInfo updatePolicy(PolicyInfo policy)
    {
        PolicyInfo existingPolicy = repository.findById(policy.getPolicy_id()).orElse(null);
        existingPolicy.setPolicy_status(policy.getPolicy_status());
        //DO IT FOR ALL THE UPDATED FIELDS
        return repository.save(existingPolicy);

    }
}
