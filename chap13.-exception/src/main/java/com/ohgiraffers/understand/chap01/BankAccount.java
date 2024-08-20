package main.java.com.ohgiraffers.understand.chap01;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + "원 입금 되었습니다.");
        } else {
            System.out.println("입금할 금액은 양수여야 합니다.");
        }
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("잔액이 부족합니다. 현재 잔액 : " + balance + "원");
        } else if(amount < 0) {
            System.out.println("출금할 금액은 양수여야 합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return "계좌 번호: " + accountNumber + "\n계좌 소유자: " + accountName + "\n잔액: " + balance + "원";
    }

}
