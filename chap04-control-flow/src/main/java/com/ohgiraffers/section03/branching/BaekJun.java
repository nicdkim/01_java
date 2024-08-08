package main.java.com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class BaekJun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("설탕 무게(3 <= N <= 5000) : ");
        int n = sc.nextInt();
        int res = minBag(n);
        System.out.println("res : " + res);

    }

    public static int minBag(int n) {
        int bag = 0;
        while (n > 0) {
            if(n % 5 == 0) {
                bag += n / 5;
                return bag;
            }
            n -= 3;
            bag++;
        }
        return -1;
    }
}
