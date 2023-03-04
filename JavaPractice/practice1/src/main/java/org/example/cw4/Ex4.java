package org.example.cw4;

public class Ex4 {
    public static void main(String[] args) {
//        Проверить четность массива
        System.out.println(isArraySymmetrical(new int[]{3, 4, 1, 4, 3, 1, 2, 4}));
    }

    public static boolean isArraySymmetrical(int[] arr) {
//        Проверить четность массива
        boolean flag = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr.length - i - 1) {
                return false;
            }
        }
        return true;
    }
}
