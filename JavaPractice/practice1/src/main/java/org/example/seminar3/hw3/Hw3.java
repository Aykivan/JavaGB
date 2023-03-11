package org.example.seminar3.hw3;

import org.example.seminar3.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг, в которых
 * простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Hw3 {
    public static void main(String[] args) {

        Book book1 = new Book("Аватар", "Алейси", 2500.0, 2009, 13);
        Book book2 = new Book("Шерлок", "Анджелис", 2500.0, 2010, 15);
        Book book3 = new Book("Шерлок", "Абрамов", 2500.0, 2010, 23);
        Book book4 = new Book("Мост", "Кейсов", 2500.0, 2011, 17);
        Book book5 = new Book("Джунгли", "Алюдов", 2500.0, 2012, 19);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        List<String> nameAuthor = new ArrayList<>();
        String searchLet = "А";
        int searchYear = 2010;

        for (Book el : bookList) {
            if (simpleNum(el.getPages()) && el.getNameAuthor().contains(searchLet) && el.getYear() >= searchYear) {
                nameAuthor.add(el.getNameAuthor());
            }
        }
        System.out.println("Фамилии авторов соответствующих условиям отбора: " + nameAuthor);
    }

    static Boolean simpleNum(int pages) {
        boolean flag = true;
        for (int i = 2; i*i <= pages; i++) {
            if (pages % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}
