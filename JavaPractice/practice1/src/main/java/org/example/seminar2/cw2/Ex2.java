package org.example.seminar2.cw2;

import java.util.Scanner;

// Дана последовательность чисел N, найти сумму чисел оканчивающихся на 5, перед которыми стоит четное число
public class Ex2 {
    public static void main(String[] args) {

        System.out.println("Сумма чисел будет равна: " + Summer());
    }

    public static int Summer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = sc.nextInt();
        System.out.print("Введити число: ");
        int num1 = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.print("Введити число: ");
            int num2 = sc.nextInt();
            if (num2 % 10 == 5 && num1 % 2 == 0) {
                sum += num1;
            }
            num1 = num2;
        }
        sc.close();
        return sum;
    }
}
