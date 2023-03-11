package org.example.seminar3.hw2.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    private String name;
    private String country;
    private Double weight;
    private Double price;
    private int sort;
}
