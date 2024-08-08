package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public static void main(String[] args) {

    }

    public void guguDan() {
        // for문 안에서 for문을 이용할 수 있다.

        // 2~9단까지 쭉 출력
        for (int dan = 2; dan <= 9; dan++) {
            for (int su = 1; su <= 10; su++) {
                System.out.println(dan + "*" + su + "=" + (dan * su));
            }
            System.out.println();
        }
    }

    public void printUpgradeGugudan() {

        // 단을 2부터 9까지 증가시킨다.
        for(int dan = 2; dan < 10; dan++) {
            printGuguDan(dan);

            System.out.println();
        }
    }

    public void printGuguDan(int dan) {
        for(int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStars(){

        /*
        * 키보드로 정수를 입력 받아 해당 정수 만큼 한 행에 "*"을 행의 번호개씩 출력 해주세요
        *
        * 예시 : 정수를 입력하세요 : 5
        *
        *   *
        *   **
        *   ***
        *   ****
        *   *****
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("줄 수를 입력 해주세요 : ");
        int row = sc.nextInt();

        for(int i = row; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
