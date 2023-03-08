package org.example.seminar2.cw3;

import java.util.Scanner;

/**
 * Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
 */
public class Ex3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 5, 6, 3, 9, 4, 2, 1}));
    }

    public static int solution(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] / array[i] == 2) {
                count += 1;
            }
        }
        return count;
    }
}
