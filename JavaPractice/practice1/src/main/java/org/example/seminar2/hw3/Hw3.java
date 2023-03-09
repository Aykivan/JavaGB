package org.example.seminar2.hw3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Введенный массив: " + Arrays.toString(array));
        System.out.println("Переработанный массив: " + Arrays.toString(newArr(array)));
    }

    public static int[] newArr(int[] array) {

        int summInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (9 < array[i] && array[i] < 100) {
                summInd += i;
            }
        }

        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            if (array[i] < 0) {
                newArray[i] = summInd;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}
