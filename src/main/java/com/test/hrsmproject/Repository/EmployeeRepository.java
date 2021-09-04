package com.test.hrsmproject.Repository;

import com.test.hrsmproject.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.hrsmproject.Service.EmployeeService;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
