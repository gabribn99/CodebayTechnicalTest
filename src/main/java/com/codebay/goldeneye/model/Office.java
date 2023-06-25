package com.codebay.goldeneye.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Office {
    private String name;
    private List<String> departments;
}
