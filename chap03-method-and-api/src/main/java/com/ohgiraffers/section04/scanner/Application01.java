package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*
        * java.util.scanner
        * 콘솔 화면에 값을 입력 받는 기능을 제공한다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해 주세요 : ");
        String name = sc.nextLine();
        System.out.println("안녕하세요 " + name + "님!");

        // 정수
        System.out.print("나이를 입력해 주세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이가 " + age + "세가 맞으세요 ?");

        System.out.print("금액을 입력해 주세요 : ");
        long lnum = sc.nextLong();
        System.out.println("입력하신 long : " + lnum);

        // 실수
        System.out.print("원하는 실수를 입력해 주세요 : ");
        double number = sc.nextDouble();    // 형변환
        System.out.println("입력하신 실수는 " + number + "입니다.");

        // 논리형
        System.out.print("true or false 입력 : ");
        boolean isTrue = sc.nextBoolean();

        if(isTrue){
            System.out.println("참이다.");
        } else {
            System.out.println("거짓이다.");
        }

        sc.nextLine();

        // 문자형 값 입력
        System.out.print("아무 문자나 입력해 주세요 : ");
        char charValue = sc.nextLine().charAt(0);
        sc.close();
        System.out.println("입력하신 문자는 : " + charValue);
    }
}
