package main.java.com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Application08 {
    public static void main(String[] args) {

        /*
        * 다른 클래스에 작성한 메소드 호출
        * */

        // non - static 메소드의 경우
        // 클래스가 다르더라도 사용하는 방법은 동일하다.

        Calculator cal = new Calculator();
        int first = 100;
        int second = 50;
        int min = cal.minNumberOf(first, second);
        System.out.println(min);

        // static 메소드의 경우
        // 다른 클래스에 작성한 static 메소드의 경우 호출할 때 반드시 클래스명을 기술해야한다.
        int max = Calculator.maxNumberOf(first, second);
        System.out.println(max);

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int b = sc.nextInt();
        sc.close();

        if(a != b) {
            System.out.println("큰 숫자 : " + Calculator.maxNumberOf(a, b));
            System.out.println("작은 숫자 : " + cal.minNumberOf(a, b));
        } else {
            System.out.println("두 숫자는 동일하다.");
        }


    }
}
