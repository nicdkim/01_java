package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    Scanner sc = new Scanner(System.in);

    public void testSimpleIfElseStatement() {

        /*
        * [if-else 표현식]
        * if(조건식) {
        *   조건식이 true일 때 실행할 내용
        * } else {
        *   조건식이 false일 때 실행할 내용
        * }
        * */

        /*
        * 정수 한 개를 입력 받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다."
        * 라고 출력하고, 홀수가 아니면 "입력하신 숫자는 짝수입니다."
        * 라고 출력하는 프로그램을 작성해보자
        * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다."
        * 라고 출력되게 한다.
        * */

        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        if(num % 2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            System.out.println("입력하신 정수는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfElseStatement() {

        // 중첩된 if-else문 실행 흐름 확인

        /*
        * 숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다"를 출력하고
        * 음수이면 "입력하신 숫자는 음수입니다."를 출력
        * 단, 0이면 "0 입니다"를 출력
        * 조건과 상관 없이 프로그램이 종료되면 "프로그램이 종료됩니다." 출력
        * */

        System.out.print("숫자를 입력 하세요 : " );
        int num = sc.nextInt();

        if(num != 0) {
            if(num > 0) {
                System.out.println("양수입니다.");
            } else {
                System.out.println("음수입니다.");
            }
        } else {
            System.out.println("0 입니다");
        }
        System.out.println("프로그램을 종료합니다.");
    }

}
