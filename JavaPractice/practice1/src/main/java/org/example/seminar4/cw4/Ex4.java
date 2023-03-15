package org.example.seminar4.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex4 {

    /**
     * Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
     */
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1, -2, -3, 4, -5, 6, 7, -8, -9));
        System.out.println(solution(someList));
        System.out.println(solution1(someList));
    }

    private static List<Integer> solution(List<Integer> someList) {
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) < 0) {
                someList.remove(i);
                i--;
            }
        }
        return someList;
    }

    private static List<Integer> solution1(List<Integer> someList) {
        for (int i = someList.size() - 1; i >= 0 ; i--) {
            if (someList.get(i) < 0) {
                someList.remove(i);
            }
        }
        return someList;
    }
}
