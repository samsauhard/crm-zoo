package com.example.zoobla.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADVISOR_T")
public class Advisor {
    @Id
    @GeneratedValue
    private int advisor_id;
    private String f_name;
    private String l_name;
    private String m_name;
    private String personal_email;
    private String business_email;
    private Date dob;
    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name="aa_fk", referencedColumnName = "advisor_id")
    private List<Address> addressList;

    private int personal_phone;
    private int business_phone;


}