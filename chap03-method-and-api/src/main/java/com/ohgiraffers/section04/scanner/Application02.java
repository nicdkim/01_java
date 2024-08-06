package main.java.com.ohgiraffers.section04.scanner;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /*
        *   nextLine()  : 공백을 포함한 한 줄을 입력. 개행문자 전까지 읽어서 반환
        *   next()      : 공백문자나 개행문자 전 까지를 읽어서 반환 (공백문자 포함하지 않음)
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력해 주세요 : ");
        String greeting = sc.nextLine();
        System.out.println(greeting);

        System.out.print("두번째 값을 입력해 주세요 : ");
        String greeting2 = sc.next();
        System.out.println(greeting2);

    }
}
