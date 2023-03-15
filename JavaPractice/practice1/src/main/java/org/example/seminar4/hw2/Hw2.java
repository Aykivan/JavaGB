package org.example.seminar4.hw2;

import java.util.Stack;

public class Hw2 {
    public static void main(String[] args) {
        String text1 = "()";
        String text2 = "(){}[]";
        String text3 = "({}[])";
        String text4 = "(]";

        System.out.println("1 = " + isValid(text1));
        System.out.println("2 = " + isValid(text2));
        System.out.println("3 = " + isValid(text3));
        System.out.println("4 = " + isValid(text4));
    }

    private static boolean isValid(String s) {
        int length = s.length();
        char[] array = s.toCharArray();
        if (length == 0) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                stack.push(array[i]);
            }
            if (array[i] == ')' || array[i] == '}' || array[i] == ']') {
                if (stack.isEmpty()) return false;
                char temp = stack.pop();
                if ((temp == '(' && array[i] == ')') || (temp == '{' && array[i] == '}') || (temp == '[' && array[i] == ']')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
