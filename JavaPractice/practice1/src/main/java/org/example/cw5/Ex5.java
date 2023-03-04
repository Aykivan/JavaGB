package org.example.cw5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
//            arr[i] = i;
        }

        int[] res = new int[n];
        res[0] = arr[0];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + arr[i];
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(" " + res[i]);
        }

    }
}
