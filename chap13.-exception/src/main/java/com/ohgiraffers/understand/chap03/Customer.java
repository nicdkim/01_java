package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String id;
    private List<Order> orders;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void viewOrderHistory() {
        if (orders.isEmpty()) {
            System.out.println("주문 내역이 없습니다.");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                System.out.println("주문 : " + (i + 1));
                System.out.println(orders.get(i));
                System.out.println();
            }
        }
    }
}