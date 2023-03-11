package org.example.seminar3.hw1;

import org.example.seminar3.hw1.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw1 {
    /**
     * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых
     * содержит «высший».
     */
    public static void main(String[] args) {

        Product product1 = new Product("высший хлеб", 120.0, 2);
        Product product2 = new Product("Белый хлеб", 90.0, 1);
        Product product3 = new Product("Апельсин", 150.0, 2);
        Product product4 = new Product("Творог высший", 170.0, 1);
        Product product5 = new Product("Молоко", 80.0, 2);
        Product product6 = new Product("Гречка высший сорт", 140.0, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        String searchName = "высший";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт товаров: ");
        int searchSort = sc.nextInt();
        Double maxPrice = 0.0;

        for (Product el : productList) {
            if (el.getSort() == searchSort && el.getName().contains(searchName)) {
                if (el.getPrice() > maxPrice) {
                    maxPrice = el.getPrice();
                }
            }
        }
        System.out.println("Максимальная стоимость товара сорта " + searchSort + " = " + maxPrice);
    }
}
