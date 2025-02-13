package com.tns.ifet.placementservice;

import jakarta.persistence.*;

@Entity
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String role;
    private String location;
    private String salary;
    private String eligibilityCriteria;
    
    public Placement() {
        super();
    }

    public Placement(Long id, String companyName, String role, String location, String salary, String eligibilityCriteria) {
        super();
        this.id = id;
        this.companyName = companyName;
        this.role = role;
        this.location = location;
        this.salary = salary;
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }
}
