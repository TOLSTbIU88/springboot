package org.example.employee_map;

import org.example.dto.EmployeeDtoRq;
import org.example.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee getRq(EmployeeDtoRq rq) {
        return new Employee(rq.getName(), rq.getAge(), rq.getSalary());
    }
}
