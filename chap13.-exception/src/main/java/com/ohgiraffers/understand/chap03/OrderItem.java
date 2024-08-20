package main.java.com.ohgiraffers.understand.chap03;

class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product.getName() + " x " + quantity + " = " + getTotalPrice() + "원";
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
