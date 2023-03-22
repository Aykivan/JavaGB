package org.example.seminar6.cw4.model;

public class Kelvin implements Converter{
    @Override
    public Double convert(Double inputValue) {
        return inputValue + 273.15;
    }
}
