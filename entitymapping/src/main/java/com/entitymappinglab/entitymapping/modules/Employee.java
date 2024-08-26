package com.entitymappinglab.entitymapping.modules;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emNo;

    private String surname;
    private String firstName;
    private String address;
    private String telephone;

    @OneToMany(mappedBy = "director")
    private Set<Department> departments;

    // Getters and Setters
    public Long getEmNo() {
        return emNo;
    }

    public void setEmNo(Long emNo) {
        this.emNo = emNo;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }
}
