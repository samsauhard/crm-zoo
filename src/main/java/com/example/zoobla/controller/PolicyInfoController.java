package com.example.zoobla.controller;

import com.example.zoobla.entity.Client;
import com.example.zoobla.entity.PolicyInfo;
import com.example.zoobla.service.CustomerService;
import com.example.zoobla.service.PolicyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PolicyInfoController {
    @Autowired
    private PolicyInfoService service;

    @PostMapping("/addPolicyInfo")
    public PolicyInfo addPolicyInfo(@RequestBody PolicyInfo policyInfo){
        return service.savePolicy(policyInfo);
    }

    @PostMapping("/addPoliciesInfo")
    public List<PolicyInfo> addPoliciesInfo(@RequestBody List<PolicyInfo> policiesInfo){
        return service.savePolicies(policiesInfo);
    }
    @GetMapping("/policies")
    public List<PolicyInfo> findAllPoliciesInfo(){
        return service.getPolicies();
    }
    @GetMapping("/policyInfo/{id}")
    public PolicyInfo findPolicyInfoById(@PathVariable int id){
        return service.getPolicyById(id);
    }
  /* @GetMapping("/product/{f_name}")
    public List<Client> findByF_name(@PathVariable String f_name){
        return service.getCustomerByF_name(f_name);
    }*/
    @PutMapping("/updatePolicyInfo")
    public PolicyInfo updatePolicyInfo(@RequestBody PolicyInfo policyInfo){
        return service.updatePolicy(policyInfo);
    }
    @DeleteMapping("/deletePolicyInfo/{id}")
    public String deletePolicyInfo(@PathVariable int id){
        return service.deletePolicy(id);
    }

}
