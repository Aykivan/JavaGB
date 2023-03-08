package org.example.seminar2.cw4;

import org.example.seminar2.cw4.model.Vector;

public class Ex4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0,1.0, 1.0);
        Vector vector2 = new Vector(1.0,2.0, 1.0);

        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длинна вектора = " + vector1.LenghtVector());
        System.out.println("Скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("Скалярное произведение = " + vector1.scalarMulti2(vector2));
        System.out.println("Угол между векторами = " + vector1.cos(vector2));
        /**
         * ДЗ
         */
        System.out.println("Сумма и разность векторов = " + vector1.summDiff(vector2);
    }


}



/**
* Создаем класс -> создаем переменные класса -> создаем полный и пустой конструктор -> гетеры и сеттеры-> переопределяем toString()
*/
