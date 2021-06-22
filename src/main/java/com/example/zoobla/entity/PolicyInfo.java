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
@Table(name = "POL_T")
public class PolicyInfo {
    @Id
    @GeneratedValue
    private int policy_id;
    private String policy_number;
    private String policy_plan_type;
    private Date policy_issue_date;
    private Date policy_expiration_date;
    private String policy_carrier;
    private String policy_premium_frequency;
    private int policy_premium_amount;
    private int face_value;
    private String product_description;
    private String policy_status;
    private String policy_product_type;

}