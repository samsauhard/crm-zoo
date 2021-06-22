package com.example.zoobla.entity;

import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HEALTH_T")
public class Health {
    @Id
    @GeneratedValue
    private int health_id;
    private String issue_type;
    private String health_issue_description;
    private Date diagnosed_date;


}
