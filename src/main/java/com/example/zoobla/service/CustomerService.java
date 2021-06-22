package com.example.zoobla.service;

import com.example.zoobla.entity.Client;
import com.example.zoobla.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Client saveCustomer(Client customer)
    {
        return repository.save(customer);
    }
    public List<Client> saveCustomers(List<Client> customers)
    {
        return repository.saveAll(customers);
    }
    public List<Client> getCustomers()
    {
        return repository.findAll();
    }
    public Client getCustomerById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    //public List<Client> getCustomerByF_name(String f_name)
   // {
    //    return repository.findByF_name(f_name);
  //  }

    public String deleteClient(int id)
    {
        repository.deleteById(id);
        return "Product Removed ||" + id;
    }
    public Client updateClient(Client client)
    {
        Client existingClient = repository.findById(client.getCustomer_id()).orElse(null);
        existingClient.setF_name(client.getF_name());
        //DO IT FOR ALL THE UPDATED FIELDS
        return repository.save(existingClient);

    }
}
