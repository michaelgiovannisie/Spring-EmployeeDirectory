package io.zipcoder.persistenceapp;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long employeeNumber;

    private String firstName;
    private String lastName;
    private String title;
    private String phoneNumber;
    private String email;
    private LocalDate hireDate;

    @ManyToOne
    private Employee manager;

    @ManyToOne
    private Department department;

    public Employee() {
    }

    public Employee(long employeeNumber,
                    String firstName,
                    String lastName,
                    String title,
                    String phoneNumber,
                    String email,
                    LocalDate hireDate,
                    Employee manager,
                    Department department) {

        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.manager = manager;
        this.department = department;
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public Employee getManager() {
        return manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}