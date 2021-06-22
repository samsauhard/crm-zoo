package com.example.zoobla.controller;

import com.example.zoobla.entity.Client;
import com.example.zoobla.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/addClient")
    public Client addCustomer(@RequestBody Client client){
        return service.saveCustomer(client);
    }

    @PostMapping("/addClients")
    public List<Client> addCustomers(@RequestBody List<Client> clients){
        return service.saveCustomers(clients);
    }
    @GetMapping("/clients")
    public List<Client> findAllCustomers(){
        return service.getCustomers();
    }
    @GetMapping("/client/{id}")
    public Client findCustomerById(@PathVariable int id){
        return service.getCustomerById(id);
    }
  /* @GetMapping("/product/{f_name}")
    public List<Client> findByF_name(@PathVariable String f_name){
        return service.getCustomerByF_name(f_name);
    }*/
    @PutMapping("/updateClient")
    public Client updateCustomer(@RequestBody Client client){
        return service.updateClient(client);
    }
    @DeleteMapping("/deleteClient/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteClient(id);
    }

}
