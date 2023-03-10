package org.example.seminar3.cw2.model;


import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String surname;
    private int numGroup;
    private int money;
    private List<Integer> evalutions;


}
