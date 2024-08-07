package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Scanner;

public class Question {

    public static void main(String[] args) {

        /*
        *   a, b, c 세 과목의 점수를 스캐너로 입력 받고 세 과목의 점수를
        *   메소드를 생성해 매개변수로 전달해 평균을 계산하고,
        *   평균과 점수를 이용하여 합격 / 불합격 처리하는 기능을 구현 해주세요
        *   (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서, 평균이 60점을 넘어야함.)
        *   합격했을 경우에는 평균 점수와 "합격입니다"를 출력하고,
        *   불합격인 경우에는 "불합격입니다." 라고 출력 해주세요.
        * */

        /*
        *   피보나치 수열(an = An-1 + An-2)을 화면에 출력해라.
        *   (첫때 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열)
        *   1. 결과값 : 1 1 2 3 5 8 13 21 34
        *   2. for문과 배열을 이용해 코드를 간소화하여 작성해야 한다.
        *   3. 9개까지 출력한다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        sc.close();

        Cal cal = new Cal();
        //System.out.println("평균 : " + cal.avrage(a,b,c));
        double ave = cal.avrage(a,b,c);

        if(cal.isPass(ave, a, b, c)) {
            System.out.printf("평균 점수 : %.2f\n합격\n", ave);
        } else {
            System.out.printf("평균 점수 : %.2f\n불합격\n", ave);
        }

    }

}
