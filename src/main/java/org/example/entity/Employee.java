package org.example.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Employee {
    @NonNull
    private String name;
    @NonNull
    private Integer age;
    @NonNull
    private Integer salary;

}
