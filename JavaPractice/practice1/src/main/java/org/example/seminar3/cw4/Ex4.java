package org.example.seminar3.cw4;



import org.example.seminar3.cw4.model.Coub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Ex4 {

    /**
     * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
     */
    public static void main(String[] args) {
        Coub coub1 = new Coub(2, "красный", "деревянный");
        Coub coub2 = new Coub(4, "желтый", "металлический");
        Coub coub3 = new Coub(6, "зеленый", "картонный");
        Coub coub5 = new Coub(6, "зеленый", "картонный");
        Coub coub6 = new Coub(6, "зеленый", "картонный");
        Coub coub4 = new Coub(3, "желтый", "деревянный");

        List<Coub> coubList = new ArrayList<>();
        coubList.add(coub1);
        coubList.add(coub2);
        coubList.add(coub3);
        coubList.add(coub4);
        coubList.add(coub5);
        coubList.add(coub6);
        System.out.println("Коллекция: " + coubList.size());
        System.out.println("Уникальная коллекция: " + unicumCollections(coubList).size());
    }

    private static Collection<Coub> unicumCollections(List<Coub> coubList) {
        return new HashSet<>(coubList);
    }
}
