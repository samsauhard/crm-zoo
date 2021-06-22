package com.example.zoobla.controller;

import com.example.zoobla.entity.Client;
import com.example.zoobla.entity.Health;
import com.example.zoobla.service.CustomerService;
import com.example.zoobla.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class HealthController {
    @Autowired
    private HealthService service;

    @PostMapping("/addHealth")
    public Health addHealth(@RequestBody Health health){
        return service.saveHealth(health);
    }

    @PostMapping("/addHealths")
    public List<Health> addHealths(@RequestBody List<Health> healths){
        return service.saveHealths(healths);
    }
    @GetMapping("/healths")
    public List<Health> findAllHealths(){
        return service.getHealths();
    }
    @GetMapping("/health/{id}")
    public Health findHealthById(@PathVariable int id){
        return service.getHealthById(id);
    }
  /* @GetMapping("/product/{f_name}")
    public List<Client> findByF_name(@PathVariable String f_name){
        return service.getCustomerByF_name(f_name);
    }*/
    @PutMapping("/updateHealth")
    public Health updateHealth(@RequestBody Health health){
        return service.updateHealth(health);
    }
    @DeleteMapping("/deleteHealth/{id}")
    public String deleteHealth(@PathVariable int id){
        return service.deleteHealth(id);
    }

}
