package main.java.com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        
        /*
        * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 메소드
        * */

        Question que = new Question();
        Scanner sc = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();

        sc.close();

//        System.out.println(a);
//        System.out.println(b);

        que.merge(a, b);
        que.subt(a, b);
        que.multi(a, b);
        que.divide(a, b);

    }
    public void merge(int a, int b){
        System.out.println("a와 b를 더한 값 : " + (a + b));
    }
    public void subt(int a, int b){
        System.out.println("a와 b를 뺀 값 : " + (a - b));
    }
    public void multi(int a, int b){
        System.out.println("a와 b를 곱한 값 : " + (a * b));
    }
    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("a와 b를 나눈 값 : " + (a / b));
        } else {
            System.out.println("b는 0이 될 수 없다.");
        }
    }
}
