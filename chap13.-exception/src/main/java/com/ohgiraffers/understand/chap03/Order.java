package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.List;

class Order {
    private List<OrderItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotalAmount() {
        return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (OrderItem item : items) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("총 주문 금액: ").append(getTotalAmount()).append("원");
        return sb.toString();
    }

    public List<OrderItem> getItems() {
        return items;
    }
}