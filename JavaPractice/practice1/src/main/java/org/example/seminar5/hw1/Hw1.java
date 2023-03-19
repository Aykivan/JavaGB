package org.example.seminar5.hw1;

import java.util.*;

public class Hw1 {
    /**
     * Подсчитать количество вхождения каждого слова
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     * toLoverCase()
     */
    public static void main(String[] args) {

        String str = "Россия идет вперед всей планеты. Планета - это не Россия.";
        System.out.println(Arrays.toString(clearArr(str)));

        Map<String, Integer> resultMap = mapResult(clearArr(str));
        for (var entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static String[] clearArr(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[-+.^:,]", "");
        String[] arrStr = str.split(" ");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i] != "") {
                list.add(arrStr[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    private static Map<String, Integer> mapResult(String[] arr) {
        Map<String, Integer> mapRes = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mapRes.putIfAbsent(arr[i], 0);
            mapRes.put(arr[i], mapRes.get(arr[i]) + 1);
        }
        return mapRes;
    }
}
