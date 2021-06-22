package com.example.zoobla.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADDRESS_T")
public class Address {
    @Id
    @GeneratedValue
    private int address_id;
    private String address_type;
    private String city;
    private String state;
    private String country;
    private String address;
    private String zip;

}
