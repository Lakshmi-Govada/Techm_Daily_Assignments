package com.querymethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpringDataJpaQueryMethods {
    public static void main(String[] args) {
        // Configure and initialize Spring Data JPA repository programmatically
        EmployeeRepository employeeRepository = new EmployeeRepository() {
            private final List<Employee> employees = new ArrayList<>();
            private long nextEmployeeId = 1;

            @Override
            public Employee save(Employee employee) {
                if (employee.getId() == null) {
                    employee.setId(nextEmployeeId++);
                }
                employees.add(employee);
                return employee;
            }

            @Override
            public Employee findById(Long id) {
                return employees.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
            }

            @Override
            public void delete(Employee employee) {
                employees.remove(employee);
            }

            @Override
            public List<Employee> findByDepartment(String department) {
                return employees.stream().filter(e -> e.getDepartment().equals(department)).collect(Collectors.toList());
            }

            @Override
            public List<Employee> findBySalaryGreaterThan(double salary) {
                return employees.stream().filter(e -> e.getSalary() > salary).collect(Collectors.toList());
            }
        };

        // Create employees
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setDepartment("IT");
        employee1.setSalary(50000);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Jane Smith");
        employee2.setDepartment("HR");
        employee2.setSalary(60000);
        employeeRepository.save(employee2);

        // Retrieve employees using query methods
        List<Employee> itEmployees = employeeRepository.findByDepartment("IT");
        System.out.println("IT Employees:");
        itEmployees.forEach(e -> System.out.println("- " + e.getName()));

        List<Employee> highPaidEmployees = employeeRepository.findBySalaryGreaterThan(55000);
        System.out.println("High-Paid Employees (> $55,000):");
        highPaidEmployees.forEach(e -> System.out.println("- " + e.getName()));
    }
}
