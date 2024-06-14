package com.querymethods;

import java.util.List;

public interface EmployeeRepository {
    Employee save(Employee employee);

    Employee findById(Long id);

    void delete(Employee employee);

    List<Employee> findByDepartment(String department);

    List<Employee> findBySalaryGreaterThan(double salary);
}
