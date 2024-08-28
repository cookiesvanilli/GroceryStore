package ru.netology;

// Single Responsibility Principle (Принцип единственной ответственности) - класс Purchase удовлетворяет этому принципу т.к.отвечает только за покупку, цену и стоимостью, занимается покупкой и ничего больше не знает.
public class Purchase {
    private String title; //  Open-Closed Principle (Принцип открытости-закрытости) - получение данных через геттеры и сетттеры
    private int count;
    private int price;

    public String getTitle() {
        return title;
    }

    public Object setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}
