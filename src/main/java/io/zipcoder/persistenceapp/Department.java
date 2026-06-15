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

    // Required by JPA
    public Department() {
    }

    public Department(long departmentNumber,
                      String departmentName,
                      Employee departmentManager) {

        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
        this.departmentManager = departmentManager;
    }
}