package org.example.seminar6.cw3;

import java.util.*;

public class Ex3 {
    /**
     * )Найти пересечения слов в массивах и указать их общее количество.
     * Пример:
     * Mas1= [“qwe”,”asd”,”qwe”,”x”]
     * Mas2=[“qwe”,”v”]
     * Результат:
     * qwe=3
     */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "v"));
        List<String> list2 = new ArrayList<>(Arrays.asList("qwe", "v"));

        Set<String> cross = new HashSet<>(list1);
        cross.retainAll(list2);

        List<String> allList = new ArrayList<>(list1);
        allList.addAll(list2);

        for (String word : cross) {
            int count = 0;
            for (String allItem : allList)
                if (word.equals(allItem)) count++;
            System.out.println(word + " " + count);
        }

        Map<String, Integer> count2 = new HashMap<>();
        for (String item : cross) {
            for (String allItem : allList) {
                if (item.equals(allItem)) {
                    Integer itemCount = count2.get(item);
                    if (itemCount == null) itemCount = 0;
                    itemCount++;
                    count2.put(item, itemCount);
                }
            }
        }
        System.out.println(count2);
    }
}
