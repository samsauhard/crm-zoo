package com.example.zoobla.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "OTHER_T")
    public class OtherInfo {
        @Id
        @GeneratedValue
        private int other_id;
        private String e_lawyer_name;
        private int e_lawyer_phone;
        private String e_lawyer_email;
        private String accountant_name;
        @Nullable
        private int accountant_phone;
        private String accountant_email;
        private boolean financial_plan;
        private String financial_plan_info;
        private Date financial_plan_date;
        private Date financial_plan_last_update;
        private boolean will;
        private boolean power_of_attorney;
        private boolean health_directive;
}
