package ru.netology.Food;

import ru.netology.Purchase;


public class Apple extends Purchase implements Food {
    //Open Closed Principle - имплементируя интерфейс Food мы добавляем классу функциональности, не изменяя его код
    private final String title = "Apple";
    private int price = 153;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Apple is bought");
    }

    @Override
    public String toString() {
        return title;
    }
}
