package io.zipcoder.persistenceapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
