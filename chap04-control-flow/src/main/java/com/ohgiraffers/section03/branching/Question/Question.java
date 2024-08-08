package main.java.com.ohgiraffers.section03.branching.Question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] drinks = {"사이다", "콜라", "환타", "박카스", "핫식스"};
        int[] prices = {500, 600, 700, 1000, 1500};

        StringBuilder choices = new StringBuilder();
        int totalCost = 0;

        while (true) {
            String choice = "";
            int price = 0;
            boolean vChoice = false;

            while (!vChoice) {
                System.out.println("=============== 자판기 ===============");
                System.out.println("| 사이다 | 콜라 | 환타 | 박카스 | 핫식스 |");
                System.out.println("|  500  | 600 | 700 | 1000  | 1500  |");
                System.out.println("=====================================");
                System.out.print("음료를 선택해 주세요 : ");
                String drink = sc.nextLine();
                for (int i = 0; i < drinks.length; i++) {
                    if (drinks[i].equals(drink)) {
                        choice = drinks[i];
                        price = prices[i];
                        vChoice = true;
                        break;
                    }
                }
                if (!vChoice) {
                    System.out.println("잘못된 음료수 입니다. 다시 선택해 주세요.");
                }
            }

            choices.append(choice).append(" ");
            totalCost += price;

            System.out.println(choice + "를 선택 하셨습니다.");
            System.out.print("계산 하시겠습니까 ? (네/아니오) : ");
            String r = sc.nextLine();

            if (r.equals("네")) {
                System.out.println("총 상품은 " + choices.toString().trim() + " 입니다.");

                String[] selectedDrinks = choices.toString().trim().split(" ");
                printDrinksArt(selectedDrinks);

                System.out.println("총 금액은 " + totalCost + "원 입니다.");

                break;
            } else if (r.equals("아니오")) {
                System.out.println("음료를 더 선택해 주세요.");
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
            }
        }
    }


    public static void printDrinksArt(String[] drinks) {
        StringBuilder top = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        StringBuilder label = new StringBuilder();
        StringBuilder bottom = new StringBuilder();

        for (String drink : drinks) {
            top.append("  _____  ");
            middle.append(" /     \\ ");
            label.append("| ").append(drink);


//            for (int i = drink.length(); i < 6; i++) {
//                label.append(" ");
//            }
            label.append(" ");
            label.append("| ");
            bottom.append(" \\_____/ ");

        }

        System.out.println(top.toString());
        System.out.println(middle.toString());
        System.out.println(label.toString());
        System.out.println(bottom.toString());
    }
}