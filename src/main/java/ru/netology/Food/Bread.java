package ru.netology.Food;

import ru.netology.Purchase;


public class Bread extends Purchase implements Food {
    //Open Closed Principle - имплементируя интерфейс Food мы добавляем классу функциональности, не изменяя его код
    private final String title = "Bread";
    private final int price = 56;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Bread is bought");
    }

    @Override
    public String toString() {
        return title;
    }
}
