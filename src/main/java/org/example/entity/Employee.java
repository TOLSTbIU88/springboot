package org.example.entity;

import lombok.Data;
import lombok.NonNull;

@Data
@NonNull
public class Employee {

    private String name;

    private Integer age;

    private Integer salary;

}