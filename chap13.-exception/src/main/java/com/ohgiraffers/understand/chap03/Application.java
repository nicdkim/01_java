package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("안심", 50000, 10));
        products.add(new Product("등심", 40000, 20));
        products.add(new Product("꽃등심", 70000, 15));

        Scanner sc = new Scanner(System.in);

        System.out.print("고객 이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("고객 ID를 입력하세요: ");
        String id = sc.nextLine();

        Customer customer = new Customer(name, id);

        while (true) {
            System.out.println("\n|------------------------- 메뉴 ---------------------------|");
            System.out.println("| 1. 제품 목록 조회 | 2. 제품 주문 | 3. 주문 내역 조회 | 0. 종료 |");
            System.out.println("|---------------------------------------------------------|");
            System.out.print("선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    viewProductList(products);
                    break;
                case 2:
                    orderProduct(sc, products, customer);
                    break;
                case 3:
                    customer.viewOrderHistory();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }

    private static void viewProductList(List<Product> products) {
        System.out.println("\n|------------- 제품 목록 -------------|");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - " +
                    product.getPrice() + "원 (재고: " + product.getStock() + ")");
        }
        System.out.println((products.size() + 1) + ". 주문하기");
        System.out.println("|------------------------------------|");
    }

    private static void orderProduct(Scanner sc, List<Product> products, Customer customer) {
        Order order = new Order();
        boolean ordering = true;

        while (ordering) {
            viewProductList(products);
            System.out.print("선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == products.size() + 1) {
                if (order.getTotalAmount() > 0) {
                    System.out.print("주문 하시겠습니까? (Y/N): ");
                    String checkOrder = sc.nextLine().trim().toLowerCase();

                    if (checkOrder.equals("y")) {
                        customer.addOrder(order);
                        System.out.println("주문이 완료되었습니다.");
                        System.out.println(order);
                    } else {
                        System.out.println("주문이 취소되었습니다.");
                        for (OrderItem item : order.getItems()) {
                            item.getProduct().reStock(item.getQuantity());
                        }
                    }
                } else {
                    System.out.println("주문된 상품이 없어 주문이 취소되었습니다.");
                }
                ordering = false;
                continue;
            }

            int productIndex = choice - 1;
            if (productIndex < 0 || productIndex >= products.size()) {
                System.out.println("잘못된 제품 번호입니다.");
                continue;
            }

            System.out.print("수량을 입력하세요: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product selectedProduct = products.get(productIndex);
            if (quantity > selectedProduct.getStock()) {
                System.out.println("재고가 부족합니다.");
                continue;
            }

            selectedProduct.outStock(quantity);
            order.addItem(new OrderItem(selectedProduct, quantity));
            System.out.println("제품이 주문에 추가되었습니다.");
        }
    }
}
