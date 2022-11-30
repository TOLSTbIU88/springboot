package org.example.Service;

import org.example.EmployeeMap.EmployeeMapper;
import org.example.dao.Dao;
import org.example.dto.EmployeeDtoRq;
import org.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private Dao inf;
    @Autowired
    private EmployeeMapper mapper;

    public void createEmployee(EmployeeDtoRq rq) {
        Employee employee = mapper.getRq(rq);
        inf.createEmployee(employee);
    }

    public Employee getEmployee(Integer id) {
        return inf.getEmployee(id);
    }

    public Employee deleteEmployee(Integer id) {
        return inf.deleteEmployee(id);
    }

    public Employee updateEmployee(Integer id, EmployeeDtoRq rq) {
        Employee employee = mapper.getRq(rq);
        return inf.updateEmployee(id, employee);
    }

}
