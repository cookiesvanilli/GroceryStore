package ru.netology;

import ru.netology.Food.Apple;
import ru.netology.Food.Bread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Liskov substitution principle - наследники класса Purchase полностью играют роль предка
        Purchase[] products = {new Bread(), new Apple()};
        //принцип DRY - повторяющийся вывод списка продуктов на экран выносим в отдельный метод
        printProducts(products);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter product number or `end`: ");
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(1);
        }
        System.out.println("Total: ");
        printProducts(products);
        printBasket(products);
    }

    private static void printProducts(Purchase[] products) {
        System.out.println("In stock: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Purchase[] products) {
        int costProducts = 0;
        System.out.println("Your basket: ");
        for (Purchase product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + "\n" + "quantity = " + product.getCount() + " шт. \n" +
                        "price = " + product.getPrice() + " " + "RUB \n" +
                        "cost = " + product.getCount() * product.getPrice() + " " + "RUB \n");

            }
        }
        System.out.println("Total: " + costProducts + " " + "RUB");
    }
}