package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    Scanner sc = new Scanner(System.in);
    public void testSimpleForStatement() {

        /*
        *   [for 표현식]
        *   for (초기식; 조건식; 증감식) {
        *       조건을 만족하는 경우 수행할 구문(반복할 구문)
        *   }
        * */

        // 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 기본 반복문
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public void testeForExample() {

        // 1 ~ 10까지의 합계를 구하시오.

        /*
        *  무엇을 반복해야 할까 ?
        *
        * 반복해야 할 내용
        * 1. 변수에 1씩 증가하는 값을 담기
        * 2. 저장된 값을 sum에 누적시키기
        * 반복 횟수는 ? 1부터 10까지 증가(10번)
        *
        * 반복하지 않을 내용
        * 1. sum 초기화
        * 2. sum 출력
        * */

        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum : " + sum);
    }

    public void printGugudan() {

        // 키보드로 2 ~ 9 사이의 구구단을 입력 받아
        // 2 ~ 9 사이인 경우 해당 단의 구구단을 출력한다.
        // 그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해야 합니다" 출력

        System.out.print("단수 입력 : ");
        int dan = sc.nextInt();

        if(dan >= 2 && dan <= 9) {
            System.out.println(dan + "단:");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("2 ~ 9 사이의 양수를 입력해야 합니다.");
        }

    }

    public void testForExample2() {

        // 숫자 두 개를 입력 받아 작은 수에서 큰 수 까지의 합계를 구해주세요.
        // 단, 같은 숫자를 입력하지 않는다는 가정

        System.out.print("첫 번째 숫자 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int b = sc.nextInt();

        int first = Math.min(a, b);
        int end = Math.max(a, b);

        if(a == b) {
            System.out.println("서로 다른 수를 입력 해주세요.");
        } else {
            int sum = 0;
            for (int i = first; i <= end; i++) {
                sum += i;
            }
            System.out.println(first + "부터 " + end +"까지의 합은 " + sum + "입니다.");
        }
    }

    public void pNum() {

        Scanner sc = new Scanner(System.in);

        System.out.print("시작 숫자 : ");
        int a = sc.nextInt();
        System.out.print("끝 숫자 : ");
        int b = sc.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        System.out.printf("%d와 %d 사이의 소수 : ", start, end);
        inRange(start, end);

    }

    public void inRange(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
