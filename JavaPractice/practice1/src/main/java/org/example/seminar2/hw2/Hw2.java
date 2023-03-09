package org.example.seminar2.hw2;

import java.util.Scanner;

/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = sc.nextInt();

        if (testNums(n)) {
            System.out.println("Последовательность является возрастающей");
        } else {
            System.out.println("Последовательность не является возрастающей");
        }
    }

    public static boolean testNums(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        int firstNum = sc.nextInt();

        boolean res = true;
        for (int i = 1; i < n; i++) {
            int lastNum = sc.nextInt();
            if (lastNum < firstNum) {
                res = false;
            }
            firstNum = lastNum;
        }
        return res;
    }
}
