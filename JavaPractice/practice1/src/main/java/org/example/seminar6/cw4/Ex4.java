package org.example.seminar6.cw4;

import org.example.seminar6.cw4.model.Celsius;
import org.example.seminar6.cw4.model.Farenheit;
import org.example.seminar6.cw4.model.Kelvin;

public class Ex4 {
    /**
     * 4)Напишите интерфейс Converter для конвертации из градусов по Цельсию в
     * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса, для валидного перевода величин.
     * Метод для конвертации назовите "convertValue".
     */

    public static void main(String[] args) {
        Double tCel = 25.0;
        Double tFar  = new Farenheit().convert(tCel);
        System.out.println("По Фаренгейту: " + tFar);
        Double tKel  = new Kelvin().convert(tCel);
        System.out.println("По Кельвину: " + tKel);
        Double tCels  = new Celsius().convert(tCel);
        System.out.println("По Цельсии: " + tCels);
    }
}
