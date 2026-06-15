package io.zipcoder.persistenceapp;

import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

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
        Department department = employee.getDepartment();

        if (department != null && department.getDepartmentNumber() > 0) {
            long departmentNumber = department.getDepartmentNumber();
            Department existingDepartment = departmentRepository.findOne(departmentNumber);

            if (existingDepartment == null) {
                throw new DepartmentNotFoundException(departmentNumber);
            }

            employee.setDepartment(existingDepartment);
        }

        return employeeRepository.save(employee);
    }
}

@ResponseStatus(HttpStatus.BAD_REQUEST)
class DepartmentNotFoundException extends RuntimeException {

    public DepartmentNotFoundException(long departmentNumber) {
        super("Department " + departmentNumber + " does not exist");
    }
}
