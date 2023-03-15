package org.example.seminar4.hw1;

import java.util.Arrays;
import java.util.LinkedList;

public class Hw1 {
    /**
     * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1 -> 2->3->4
     * Вывод:
     */

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Первоначальный список: " + integerLinkedList);
        System.out.println("Перевернутый список: " + reverseList(integerLinkedList));
    }

    /**
     * @param someList - исходный список
     * @return - перевернутый список
     */
    private static LinkedList reverseList(LinkedList<Integer> someList) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = someList.size() - 1; i >=0 ; i--) {
            reverseList.add(someList.get(i));
        }
        return reverseList;
    }
}
