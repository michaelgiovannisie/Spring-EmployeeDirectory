package io.zipcoder.persistenceapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long departmentNumber;

    private String departmentName;

    @OneToOne
    private Employee departmentManager;

    public Department() {
    }

    public Department(long departmentNumber,
                      String departmentName,
                      Employee departmentManager) {

        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
        this.departmentManager = departmentManager;
    }

    public long getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(long departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Employee departmentManager) {
        this.departmentManager = departmentManager;
    }
}
