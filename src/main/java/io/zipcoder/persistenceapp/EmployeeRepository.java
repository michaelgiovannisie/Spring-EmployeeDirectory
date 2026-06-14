package io.zipcoder.persistenceapp;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    public List<Employee> findByManager(Employee employee);
    public List<Employee> findByDepartment(Department department);
    public List<Employee> findByManagerIsNull();
}
