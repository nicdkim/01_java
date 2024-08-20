package main.java.com.ohgiraffers.understand.chap01;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("계좌 번호를 입력하세요 : ");
        String accountNumber = sc.nextLine();

        System.out.print("계좌 소유자를 입력하세요 : ");
        String accountName = sc.nextLine();

        System.out.print("초기 잔액을 입력하세요 : ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountName, initialBalance);
        System.out.println("\n" + account.getAccountDetails());

        while (true) {
            System.out.println();
            System.out.println("|------------ 메뉴를 선택하세요 -----------|");
            System.out.println("| 1. 입금 | 2. 출금 | 3. 잔액조회 | 0. 종료 |");
            System.out.println("|---------------------------------------|");
            System.out.print("선택 : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("입금할 금액을 입력하세요 : ");
                    double depositAccount = sc.nextDouble();
                    account.deposit(depositAccount);
                    break;
                case 2:
                    System.out.print("출금할 금액을 입력하세요 : ");
                    double withdrawAccount = sc.nextDouble();
                    account.withdraw(withdrawAccount);
                    break;
                case 3:
                    System.out.println("현재 잔액 : " + account.checkBalance() + "원");
                    break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        }


    }
}
