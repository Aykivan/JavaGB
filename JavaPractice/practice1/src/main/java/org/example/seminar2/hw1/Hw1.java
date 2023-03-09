package org.example.seminar2.hw1;


import java.util.Scanner;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = sc.nextInt();
        System.out.println("Введите числа: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j*j <= num; j++) {
                if (num % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                sum += num;
            }
            flag = true;
            num = sc.nextInt();
        }
        sc.close();
        System.out.println("Сумма простых чисел будет равна: " + sum);
    }
}
