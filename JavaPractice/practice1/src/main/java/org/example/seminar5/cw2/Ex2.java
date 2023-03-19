package org.example.seminar5.cw2;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(searchDouble(arr));
        System.out.println(searchDouble2(arr));
    }

    private static boolean searchDouble(int[] arr) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (intMap.containsKey(arr[i])) {
                return false;
            } else intMap.put(arr[i], 1);
        }
        return true;
    }

    private static boolean searchDouble2(int[] arr) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            intMap.put(arr[i], 1);
        }
        return intMap.size() == arr.length;
    }
}
