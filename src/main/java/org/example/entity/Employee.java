package org.example.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Employee {
    @NonNull
    private String Name;
    @NonNull
    private Integer Age;
    @NonNull
    private Integer Salary;

}
