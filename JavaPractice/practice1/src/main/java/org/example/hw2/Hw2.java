package org.example.hw2;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {

        int summ = 0;
        System.out.println("Вводите числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 0) {
            int b = sc.nextInt();
            if (a > 0 && b < 0) {
                summ += a;
            }
            a = b;
        }
        System.out.println("result: " + summ);
    }
}
