package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*
         * 사용자에게 숫자 두 개와 연산자를 입력 받습니다.
         * 입력된 연산을 수행하여 결과를 출력합니다.
         * / 는 0으로 할 수 없기 때문에 예외처리 해주시고
         * 사용자가 잘못된 연산자를 입력하면 예외처리 해주세요
         * */

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double n1 = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double n2 = sc.nextDouble();

            System.out.print("연산자를 입력하세요 (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            double result = calculate(n1, n2, op);
            System.out.println("결과: " + result);

        } catch (ArithmeticException e) {
            System.out.println("오류: 0으로 나눌 수 없습니다.");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("오류: 잘못된 연산자입니다.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("오류: 잘못된 입력입니다.");
            e.printStackTrace();
        }
    }

    public static double calculate(double n1, double n2, char op) {
        switch (op) {
            case '+' :
                return n1 + n2;
            case '-' :
                return n1 - n2;
            case '*' :
                return n1 * n2;
            case '/' :
                if (n2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return n1 / n2;
            case '%' :
                if (n2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return n1 % n2;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }
}
