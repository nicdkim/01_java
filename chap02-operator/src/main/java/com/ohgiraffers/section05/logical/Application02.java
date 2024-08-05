package main.java.com.ohgiraffers.section05.logical;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 논리 연산자의 우선순위 활용
        * 논리 and 연산자와 or 연산자의 우선 순위
        * && : 11순위
        * || : 12순위
        * 논리 and 연산자가 or 연산자보다 우선 순위가 높다.
        * */

        // (1 <= 변수 <= 100) 불가
        int num1 = 55;
        System.out.println("1부터 100사이 인지 확인 : " + ((num1 > 1) && (num1 <= 100)));

        // 영어 대문자인지 확인
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + ((ch1 >= 'A') && (ch1 <= 'Z')));
        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + ((ch2 >= 'A') && (ch2 <= 'Z')));

        // 대소문자 상관 없이 영문자 y 인지를 확인
        char ch3 = 'y';
        char ch4 = 'Y';
        System.out.println((ch3 == 'y') || ch3 == 'Y');
        System.out.println((ch4 == 'y') || (ch4 == 'Y'));

        // 영문자인지 확인
        // 아스키코드 이용해서 확인 a = 97, z = 122, A = 65, Z = 90
        System.out.println("-----------------------");
        System.out.println("입력 값 : ");
        Scanner sc = new Scanner(System.in);
        char inputChar = sc.next().charAt(0);

        if (isAlphabet(inputChar)) {
            System.out.println("입력하신 문자는 영문자입니다.");
        } else {
            System.out.println("입력하신 문자는 영문자가 아닙니다.");
        }
        sc.close();
    }

    public static boolean isAlphabet(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }


    }


