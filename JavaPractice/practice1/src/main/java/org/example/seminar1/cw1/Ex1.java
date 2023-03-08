package org.example.seminar1.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("result = " + subtractProductAndSum(n));
        System.out.printf("result: %d", subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int multi = 1;
        while (n != 0) {
            sum += n % 10;
            multi *= n % 10;
            n = n / 10;
        }
        return (multi - sum);
    }
}
