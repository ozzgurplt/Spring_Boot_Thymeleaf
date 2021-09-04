package com.test.hrsmproject.Service;

import com.test.hrsmproject.Model.Employee;
import com.test.hrsmproject.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);


}
