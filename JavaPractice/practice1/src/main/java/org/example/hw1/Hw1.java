package org.example.hw1;

import java.util.Scanner;

//import java.util.Arrays; - один из методов вывода массива
public class Hw1 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность слов: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strTrim = str.trim();
        String[] words = strTrim.split(" ");

//        System.out.println(Arrays.toString(words));
//        Узнал о нескольких способах вывести массив в одну строку, был еще один через цикл, но решил остановиться на этом
        System.out.println("Введенные данные: " + str);
        System.out.println("myVersion: " + String.join(" ", myVersion(words)));
        System.out.println("googlVersion: " + googlVersion(words));
    }

/*
Немного не уловил один момент, с помощью trim мы удаляем пробелы в конце и вначале вводимого предложения, а как тогда быть с лишними
пробелами, которые расположены между слов, как показано в третьем примере вывода? Хотелось бы увидеть разбор данной задачи на семинаре
*/
    public static String[] myVersion(String[] words) {
        String[] reverse = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reverse[i] = words[words.length - 1 - i];
        }
        return reverse;
    }

/*
По итогу сам дошел только до решения выше.
Погрузился в данный вопрос и узнал о такиех вещах как StringBuilder и StringBuffer, далее я разобрался, как можно избавиться от пробелов
между строк и получил решение ниже (не без помощи гугла конечно).
 */
    public static String googlVersion(String[] words) {
        StringBuffer result = new StringBuffer();
        for (int i = words.length - 1; i >= 0 ; i--) {
            if (words[i].length() != 0) {
                if (result.length() != 0) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }
        return result.toString();
    }

/*
В итоге получилось так, что мое решение не может убрать пробелы между слов, а решение которое я нашел в гугле (оно было на StringBuilder, я его
не очень хорошо понял, поэтому преобразовал его в StringBuffer) отлично решает данную задачу.
 */
}
