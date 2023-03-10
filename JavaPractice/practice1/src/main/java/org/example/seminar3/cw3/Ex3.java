package org.example.seminar3.cw3;

import org.example.seminar3.cw3.model.Coub;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    /**
     * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд) и
     * материал (деревянный, металлический, картонный и тд.). Найти:
     * - количество кубиков желтого цвета и их суммарный объем;
     * - количество деревянных кубиков с ребром 3 см
     */

    public static void main(String[] args) {

        Coub coub1 = new Coub(2, "красный", "деревянный");
        Coub coub2 = new Coub(4, "желтый", "металлический");
        Coub coub3 = new Coub(6, "зеленый", "картонный");
        Coub coub4 = new Coub(3, "желтый", "деревянный");

        List<Coub> coubList = new ArrayList<>();
        coubList.add(coub1);
        coubList.add(coub2);
        coubList.add(coub3);
        coubList.add(coub4);

        int countCoub = 0;
        int countSumVolume = 0;
        int countWood = 0;
        for (Coub coub : coubList) {
            if (coub.getColor().equals("желтый")) {
                countCoub++;
                countSumVolume += volumeCoub(coub.getSize());
            }
            if (coub.getMaterial().equals("деревянный") && coub.getSize() == 3) {
                countWood++;
            }
        }
        System.out.println("Количество желтых кубиков = " + countCoub);
        System.out.println("Общий обьем желтых кубиков = " + countSumVolume);
        System.out.println("Количество деревянных кубиков = " + countWood);
    }

    private static int volumeCoub(int size) {
        return size * size * size;
    }
}
