package main.java.com.ohgiraffers.section06.temary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

//        int stu1 = 90;
//        int stu2 = 95;
//        int stu3 = 81;
//
//        int ave = (stu1 + stu2 + stu3) / 3;
//        System.out.println("평균 : " + ave);
//
//        String result1 = (stu1 >= 90 && stu1 <= 100) ? "합격" : "불합격";
//        System.out.println("1번 학생 : " + result1);
//        String result2 = (stu2 >= 90 && stu2 <= 100) ? "합격" : "불합격";
//        System.out.println("2번 학생 : " + result2);
//        String result3 = (stu3 >= 90 && stu3 <= 100) ? "합격" : "불합격";
//        System.out.println("3번 학생 : " + result3);
//
//        System.out.println("---------------------------");
//        int user1 = 120;
//        String result4 = (user1 >= 120) ? "탑숭 가능" : "탑승 불가능";
//        System.out.println("user1은 : " + result4);

//        System.out.println("---------------------------");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("학생 1의 성적 : ");
//        int student1 = sc.nextInt();
//        System.out.println("학생 2의 성적 : ");
//        int student2 = sc.nextInt();
//        System.out.println("학생 3의 성적 : ");
//        int student3 = sc.nextInt();
        Scanner sc = new Scanner(System.in);
        int student1 = getStudentScore(sc, "학생 1의 성적 : ");
        int student2 = getStudentScore(sc, "학생 2의 성적 : ");
        int student3 = getStudentScore(sc, "학생 3의 성적 : ");

        System.out.println("학생 1의 성적 : " + student1);
        System.out.println("학생 2의 성적 : " + student2);
        System.out.println("학생 3의 성적 : " + student3);

        int average = (student1 + student2 + student3) / 3;
        System.out.println("학생들의 평균은 : " + average);
        String score1 = (student1 >= 90 && student1 <= 100) ? "합격" : "불합격";
        String score2 = (student2 >= 90 && student2 <= 100) ? "합격" : "불합격";
        String score3 = (student3 >= 90 && student3 <= 100) ? "합격" : "불합격";

        System.out.println("학생 1은 : " + score1);
        System.out.println("학생 2은 : " + score2);
        System.out.println("학생 3은 : " + score3);

        System.out.println("----------------------------");
        System.out.println("키 : ");
        int height = sc.nextInt();
        String pass = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println("해당 승객은 : " + pass);

        sc.close();

    }
    private static int getStudentScore(Scanner sc, String prompt) {
        int score = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                score = sc.nextInt();

                if (score <= 0 || score >= 100) {
                    System.out.println("0에서 100사이의 성적을 입력하세요.");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("숫자를 입력해 주세요.");
                sc.next();
            }
        }
        return score;
    }
}
