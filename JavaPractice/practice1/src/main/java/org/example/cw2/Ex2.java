package org.example.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        Найти количество положительных чисел, после которых идут отрицательные
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int a = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = sc.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        sc.close();
        System.out.println("k: " + k);
    }
}
