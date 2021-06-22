package com.example.zoobla.controller;

import com.example.zoobla.entity.Advisor;
import com.example.zoobla.entity.Client;
import com.example.zoobla.service.AdvisorService;
import com.example.zoobla.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AdvisorController {
    @Autowired
    private AdvisorService service;

    @PostMapping("/addAdvisor")
    public Advisor addAdvisor(@RequestBody Advisor advisor){
        return service.saveAdvisor(advisor);
    }

    @PostMapping("/addAdvisors")
    public List<Advisor> addAdvisors(@RequestBody List<Advisor> advisors){
        return service.saveAdvisors(advisors);
    }
    @GetMapping("/advisors")
    public List<Advisor> findAllAdvisors(){
        return service.getAdvisors();
    }
    @GetMapping("/advisor/{id}")
    public Advisor findAdvisorById(@PathVariable int id){
        return service.getAdvisorById(id);
    }
  /* @GetMapping("/product/{f_name}")
    public List<Client> findByF_name(@PathVariable String f_name){
        return service.getCustomerByF_name(f_name);
    }*/
    @PutMapping("/updateAdvisor")
    public Advisor updateAdvisor(@RequestBody Advisor advisor){
        return service.updateAdvisor(advisor);
    }
    @DeleteMapping("/deleteAdvisor/{id}")
    public String deleteAdvisor(@PathVariable int id){
        return service.deleteAdvisor(id);
    }

}
