package org.example.seminar5.hw2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw2 {
    /**
     * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
     */
    public static void main(String[] args) {

        String text = "один два три четыре три два два один пять";
        String search = "два";

        Map<String, Integer> resultMap = wordCounter(text, search);
        for (var entry : resultMap.entrySet()) {
            System.out.println("Количество повторений слова - " + entry.getKey() + ", равно: " + entry.getValue());
        }
    }

    private static Map<String, Integer> wordCounter (String text, String search) {
        String[] correctText = text.split(" ");

        Map<String, Integer> countSearch = new HashMap<>();
        countSearch.put(search, 0);
        for (int i = 0; i < correctText.length; i++) {
            if (countSearch.containsKey(correctText[i])) {
                countSearch.put(correctText[i], countSearch.get(correctText[i]) + 1);
            }
        }
        return countSearch;
    }
}
