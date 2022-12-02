package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.service.EmployeeService;
import org.example.dao.Dao;
import org.example.dto.EmployeeDtoRq;
import org.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MyControl {

    private EmployeeService service;

    @PostMapping(path = "/employee")
    public void createEmployee(@RequestBody EmployeeDtoRq rq) {
        service.createEmployee(rq);
    }

    @GetMapping(path = "/employee/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return service.getEmployee(id);
    }

    @PatchMapping(path = "/employee/{id}")
    public Employee updateEmployee(@RequestBody EmployeeDtoRq rq, @PathVariable Integer id) {
        return service.updateEmployee(id, rq);
    }

    @DeleteMapping(path = "/employee/{id}")
    public Employee deleteEmployee(@PathVariable Integer id) {
        return service.deleteEmployee(id);
    }

    @GetMapping(path = "/employees")
    public Map<Integer, Employee> getEmployees() {
        return Dao.getEmployees();
    }
}
