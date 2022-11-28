package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.Service.EmployeeService;
import org.example.dto.EmployeeDtoRq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MyControl {

    EmployeeService employeeService;

    @PostMapping(path = "/createEmployee")
    public Integer createEmployee(@RequestBody EmployeeDtoRq employeeDtoRq) {
        return employeeService.createEmployee(employeeDtoRq);
    }

    @GetMapping(path = "/getEmployee/{id}")
    public EmployeeDtoRq getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
    }


}
