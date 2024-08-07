package main.java.com.ohgiraffers.section01.conditional.question;

public class Fibonacci {
    public static void main(String[] args) {

        int[] fibo = new int[9];

        fibo[0] = 1;
        fibo[1] = 1;

        for(int i = 2; i < 9; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for(int num : fibo) {
            System.out.print(num + " ");
        }

    }
}
