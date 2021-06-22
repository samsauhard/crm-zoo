package com.example.zoobla.controller;

import com.example.zoobla.entity.Address;
import com.example.zoobla.entity.Client;
import com.example.zoobla.service.AddressService;
import com.example.zoobla.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AddressController {
    @Autowired
    private AddressService service;

    @PostMapping("/addAddress")
    public Address addAddress(@RequestBody Address address){
        return service.saveAddress(address);
    }

    @PostMapping("/addAddresses")
    public List<Address> addAddresses(@RequestBody List<Address> addresses){
        return service.saveAddresses(addresses);
    }


    @GetMapping("/addresses")
    public List<Address> findAllAddresses(){
        return service.getAddresses();
    }
    @GetMapping("/address/{id}")
    public Address findAddressById(@PathVariable int id){
        return service.getAddressById(id);
    }
  /* @GetMapping("/product/{f_name}")
    public List<Client> findByF_name(@PathVariable String f_name){
        return service.getCustomerByF_name(f_name);
    }*/
    @PutMapping("/updateAddress")
    public Address updateAddress(@RequestBody Address address){
        return service.updateAddress(address);
    }
    @DeleteMapping("/deleteAddress/{id}")
    public String deleteAddress(@PathVariable int id){
        return service.deleteAddress(id);
    }

}
