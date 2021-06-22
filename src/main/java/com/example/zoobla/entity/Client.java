package com.example.zoobla.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENT_T")
public class Client implements Serializable {
    @Id
    @GeneratedValue
    private int customer_id;
    private String f_name;
    private String l_name;
    private String m_name;
    private Date dob;
    private boolean gender;
    private boolean smoking;
    private int phone_number;
    private String phone_number_type;
    private String email;
    private String email_type;
    private String occupation;
    private String work_details;
    private String lead_source;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Advisor  advisor_id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Advisor  service_advisor_id;

    private Date lastContactedOn;
    private int no_of_children;
    private int no_of_grandchildren;
    private String comments;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private OtherInfo otherinfo;

    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name="ca_fk", referencedColumnName = "customer_id")
    private List<Address> addresses;

    @OneToMany(targetEntity = Health.class, cascade = CascadeType.ALL)
    @JoinColumn(name="ch_fk", referencedColumnName = "customer_id")
    private List<Health> health_issues;

    @OneToMany(targetEntity = PolicyInfo.class, cascade = CascadeType.ALL)
    @JoinColumn(name="cpo_fk", referencedColumnName = "email")
    private List<PolicyInfo> policies;
}