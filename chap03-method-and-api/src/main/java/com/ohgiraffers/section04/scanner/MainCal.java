package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class MainCal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cal cal = new Cal();

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        double num1 = sc.nextDouble();

        System.out.print("연산할 기호를 쓰세요 : ");
        char operator = sc.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요 : ");
        double num2 = sc.nextDouble();

        sc.close();

        double res;
        
        try {
            switch (operator) {
                case '+' :
                    res = cal.add(num1, num2);
                    break;
                case '-' :
                    res = cal.sub(num1, num2);
                    break;
                case '*' :
                    res = cal.mul(num1, num2);
                    break;
                case '/' :
                    res = cal.div(num1, num2);
                    break;
                case '%' :
                    res = cal.remain(num1, num2);
                    break;
                default :
                    System.out.println("잘못된 연산자입니다.");
                    return;
            }
            System.out.println("결과는 " + res + "입니다.");
        } catch (AbstractMethodError e) {
            System.out.println(e.getMessage());
        }
    }
}
