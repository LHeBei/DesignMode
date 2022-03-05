package com.heior.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heior
 */
public class Employee {
    private String name;
    private Integer salary;

    List<Employee> employees = new ArrayList<>();


    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
