package com.codebay.goldeneye.model;

import lombok.Data;

@Data
public class Employee {

    private String name, surname, department, office;

    public Employee() {
        this.name = "";
        this.surname = "";
        this.department = "";
        this.office = "";
    }
}
