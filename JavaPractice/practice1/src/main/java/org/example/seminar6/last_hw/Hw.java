package org.example.seminar6.last_hw;

import org.example.seminar6.last_hw.model.Notebook;

import java.util.*;

public class Hw {
    /**
     * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
     * • Создать множество ноутбуков.
     * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
     * Критерии фильтрации можно хранить в Map. Например:
     * "Введите цифру, соответствующую необходимому критерию: "
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
     * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     */

    public static void main(String[] args) {
        List<Notebook> noteList = listNb();
        System.out.println(filter(noteList));
    }

    public static List<Notebook> listNb() {
        Notebook not1 = new Notebook(8, 256, "MacOS", "white");
        Notebook not2 = new Notebook(8, 500, "Linux", "black");
        Notebook not3 = new Notebook(8, 1000, "Windows", "grey");

        Notebook not4 = new Notebook(16, 500, "MacOS", "white");
        Notebook not5 = new Notebook(16, 1000, "Linux", "black");
        Notebook not6 = new Notebook(16, 2000, "Windows", "grey");

        Notebook not7 = new Notebook(32, 1000, "MacOS", "white");
        Notebook not8 = new Notebook(32, 2000, "Linux", "black");
        Notebook not9 = new Notebook(32, 4000, "Windows", "grey");

        List<Notebook> listNote = new ArrayList<>();
        listNote.add(not1);
        listNote.add(not2);
        listNote.add(not3);
        listNote.add(not4);
        listNote.add(not5);
        listNote.add(not6);
        listNote.add(not7);
        listNote.add(not8);
        listNote.add(not9);

        return listNote;
    }

    public static List<Notebook> filter(List<Notebook> notebookList) {
        Map<Integer, String> filterMap = new HashMap<>();
        filterMap.put(1, "ОЗУ");
        filterMap.put(2, "Объем ЖД");
        filterMap.put(3, "Операционная система");
        filterMap.put(4, "Цвет");

        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        Scanner sc = new Scanner(System.in);
        int filter = sc.nextInt();
        int valueOzu = 0;
        int valueHd = 0;
        String valueSystem = "";
        String valueColor = "";

        while (filter != 0) {
            Scanner sc2 = new Scanner(System.in);
            if (filter == 1) {
                System.out.println("Введите минимальное значение OZU: ");
                valueOzu = sc2.nextInt();
            } else if (filter == 2) {
                System.out.println("Введите минимальное значение объема HD: ");
                valueHd = sc2.nextInt();
            } else if (filter == 3) {
                System.out.println("Введите операционную систему (Windows, Linux, MacOS): ");
                valueSystem = sc2.nextLine();
            } else if (filter == 4) {
                System.out.println("Введите цвет (white, black, grey): ");
                valueColor = sc2.nextLine();
            }
            System.out.println("Введите следующий фильтр или 0, чтобы прекратить ввод: ");
            filter = sc.nextInt();
        }
        System.out.println("Ваши фильтры: ");
        if (valueOzu > 0) System.out.println("OZU: " + valueOzu);
        if (valueHd > 0) System.out.println("HD: " + valueHd);
        if (valueSystem != "") System.out.println("Операционная система: " + valueSystem);
        if (valueColor != "") System.out.println("Цвет: " + valueColor);

        List<Notebook> searchList = new ArrayList<>();
        for (Notebook nb : notebookList) {

            if (nb.getOZU() >= valueOzu && nb.getVolumeHD() >= valueHd) {
                searchList.add(nb);
            }

            if (valueSystem != "" && !nb.getSystem().equals(valueSystem)) {
                searchList.remove(nb);
            }

            if (valueColor != "" && !nb.getColor().equals(valueColor)) {
                searchList.remove(nb);
            }
        }

        return searchList;
    }
}
