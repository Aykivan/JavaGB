package org.example.seminar2.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = sc.nextDouble();
        System.out.println("Введите степень n: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(x + " в степени " + n + ", будет равно: " + Pow(x, n));
    }

    public static double Pow(double x, int n) {
        double result = 1.0;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        for (int i = 0; i > n; i--) {
            result /= x;
        }
        return result;
    }
}
