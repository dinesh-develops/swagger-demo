package com.swagger.swaggerdemo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerModel {
    @Id
    @Column(name = "customerId")
    private int customerId;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "mobileNumber")
    private String mobileNumber;
    @Column(name = "emailId")
    private String emailId;
    @Column(name = "experience")
    private int experience;
    @Column(name = "role")
    private String role;

    public CustomerModel() {
    }

    public CustomerModel(int customerId, String customerName, String mobileNumber, String emailId, int experience, String role) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.experience = experience;
        this.role = role;
    }

    public int getcustomerId() {
        return customerId;
    }

    public void setcustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getcustomerName() {
        return customerName;
    }

    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
