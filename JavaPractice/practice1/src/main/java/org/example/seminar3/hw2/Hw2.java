package org.example.seminar3.hw2;

import org.example.seminar3.hw2.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw2 {
    /**
     * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования
     * товаров заданного сорта с наименьшей ценой.
     */
    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", "Россия", 12.0, 25.0, 1);
        Product product2 = new Product("Помидоры", "Китай", 12.0, 25.0, 1);
        Product product3 = new Product("Апельсин", "Англия", 15.0, 30.0, 1);
        Product product4 = new Product("Творог", "Таиланд", 13.0, 50.0, 2);
        Product product5 = new Product("Молоко", "Монголия", 13.0, 40.0, 2);
        Product product6 = new Product("Гречка", "Казахстан", 50.0, 40.0, 2);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сорт товаров: ");
        int searchSort = sc.nextInt();
        Double minPrice = 1000.0;
        List<String> productName = new ArrayList<>();

        for (Product el : productList) {
            if (el.getSort() == searchSort) {
                if (el.getPrice() < minPrice) {
                    minPrice = el.getPrice();
                }
            }
        }
        for (Product el : productList) {
            if (el.getSort() == searchSort) {
                if (el.getPrice().equals(minPrice)) {
                    productName.add(el.getName());
                }
            }
        }
        System.out.println("Минимальная цена = " + minPrice);
        System.out.println("Продукты с минимальной ценой: " + productName);
    }
}
