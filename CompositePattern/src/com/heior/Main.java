package com.heior;

import com.heior.domain.Employee;

/**
 * @author heior
 * 树形结构，简而言之就是在类中放一个该类的列表（参考二叉树）
 */
public class Main {
    public static void main(String[] args) {
        Employee headEmployee = new Employee("heior 1",100);
        Employee lastEmployee = new Employee("heior 2", 300);
        Employee CEO = new Employee("boss", 200);

        Employee normalEmployee = new Employee("lzq",10);
        Employee sampleEmployee = new Employee("lzq 2",2);

        CEO.addEmployee(headEmployee);
        CEO.addEmployee(lastEmployee);
        headEmployee.addEmployee(normalEmployee);
        headEmployee.addEmployee(sampleEmployee);
        for(Employee employee : CEO.getEmployees()) {
            System.out.println(employee.toString());
            for (Employee employee1 : employee.getEmployees()) {
                System.out.println(employee1.toString());
            }
        }
    }
}
