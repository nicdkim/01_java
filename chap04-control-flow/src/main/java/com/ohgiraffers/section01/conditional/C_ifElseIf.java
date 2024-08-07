package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    Scanner sc = new Scanner(System.in);

    public void testSimpleIfElseIfStatement() {

        /*
        * [if-else-if 표현식]
        * if(조건식1) {
        *   조건식1이 true일 때 실행할 명령문;
        * } else if(조건식2) {
        *   조건식1이 false이고 조건식2가 true일 때 실행할 명령문;
        * } else {
        *   위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
        *
        * 여러개의 조건을 제시하여 그 중 하나를 반드시 실행시키고 싶은 경우 사용한다.
        * */

        // 금도끼, 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지 물어보는 코드

        System.out.print("어떤 도끼가 너의 도끼냐 ? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
        int num = sc.nextInt();

        // 금도끼를 고른 경우
        if(num == 1) {
            System.out.println("거짓말 쟁이 ! 너에게는 아무런 도끼도 줄 수 없구나 !");
        } else if(num == 2) {
            // 은도끼를 고른 경우
            System.out.println("욕심이 과하지는 않지만 그래도 거짓말을 하고 있구나 !");
        } else if(num == 3) {
            System.out.println("정직하구나 금도끼, 은도끼, 쇠도끼 다 가져 가거라 !");
        } else {
            System.out.println("줘도 못갖네");
        }
        // 대답 여부와 상관 없이 프로그램 마지막에 실행될 내용
        System.out.println("그렇게 산신령은 다시 연못 속으로 사라졌다...");

    }

    public void testNestedIfElseIfStatement() {

        /*
         *  A 대학의 한 교수님은 학생들의 시험 성적을 수기로 계산해서 학점 등급을 매기는 체점 방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'
         *  60점 미만인 경우에는 'F'를 학점 등급으로 하는 기준이다.
         *  추가로 각 등급의 중간점수 (95,85,75,65) 를 넘는 경우는 '+' 를 붙여서 등급을 세분화 했었다.
         *  신경쓸게 너무 많아진 교수님은 학생의 이름과 점수를 입력하면 자동으로 학점 등급이
         *  계산되는 프로그램을 만들기로 했다.
         * */

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("성적 : ");
        int score = sc.nextInt();

        String grade = "";

        if(score >= 90) {
            grade = "A";
            if(score >= 95) {
                grade += "+";
            }
        } else if(score >= 80) {
            grade = "B";
            if(score >= 85) {
                grade += "+";
            }
        } else if(score >= 70) {
            grade = "C";
            if(score >= 75) {
                grade += "+";
            }
        } else if(score >= 60) {
            grade = "D";
            if(score >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }
        if(grade.equals("F")) {
            System.out.println(name + "학생은 F 입니다.");
        } else {
            System.out.println(name + "학생의 점수는 " + score + "이고, 학점은 " + grade + "입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

}
