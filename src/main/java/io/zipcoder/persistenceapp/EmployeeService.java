package io.zipcoder.persistenceapp;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    private EmployeeRepository employeeRepository;

    private DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                       DepartmentRepository departmentRepository) {

        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
