package main.java.com.ohgiraffers.understand.chap03;

class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void outStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new IllegalArgumentException("재고가 부족합니다.");
        }
    }

    public void reStock(int quantity) {
        this.stock += quantity;
    }
}