package ru.netology;

public class Purchase {
    private String title;
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
