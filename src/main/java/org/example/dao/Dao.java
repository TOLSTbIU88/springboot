package org.example.dao;

import org.example.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Dao {
    private static int Id = 1;
    private static Map<Integer, Employee> employees = new HashMap<>();

    private static int Id() {
        return Id++;
    }

    public void createEmployee(Employee employee) {
        employees.put(Id(), employee);
    }

    public Employee getEmployee(Integer id) {
        return employees.getOrDefault(id, null);
    }

    public Employee updateEmployee(Integer id, Employee employee) {
        Employee updatedEmployee = employees.get(id);
        return updatedEmployee;
    }

    public Employee deleteEmployee(Integer id) {
        Employee deletedEmployee = getEmployee(id);
        employees.remove(id);
        return deletedEmployee;
    }

    public static Map<Integer, Employee> getEmployees() {
        return employees;
    }
}
