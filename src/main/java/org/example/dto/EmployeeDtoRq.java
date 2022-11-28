package org.example.dto;

import lombok.Data;
import lombok.NonNull;

@Data
@NonNull
public class EmployeeDtoRq {

    private String name;

    private Integer age;

    private Integer salary;

}
