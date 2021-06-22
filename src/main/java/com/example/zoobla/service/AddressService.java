package com.example.zoobla.service;

import com.example.zoobla.entity.Address;
import com.example.zoobla.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository repository;

    public Address saveAddress(Address address)
    {
        return repository.save(address);
    }
    //----------------------------------------------
    public List<Address> saveAddresses(List<Address> addresses)
    {
        return repository.saveAll(addresses);
    }
    //-----------------------------------------------
    public List<Address> getAddresses()
    {
        return repository.findAll();
    }
    //-----------------------------------------------
    public Address getAddressById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    //------------------------------------------------
    //public List<Client> getCustomerByF_name(String f_name)
    // {
    //    return repository.findByF_name(f_name);
    //  }
    //-------------------------------------------------

    public String deleteAddress(int id)
    {
        repository.deleteById(id);
        return "Address Removed ||" + id;
    }
    //-------------------------------------------------
    public Address updateAddress(Address address)
    {
        Address existingAddress = repository.findById(address.getAddress_id()).orElse(null);
        existingAddress.setAddress(address.getAddress());
        //DO IT FOR ALL THE UPDATED FIELDS
        return repository.save(existingAddress);
    }
    //--------------------------------------------------
}
