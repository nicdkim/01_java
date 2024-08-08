package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    Scanner sc = new Scanner(System.in);
    public void testSimpleWhileStatement() {

        /*
        * [while 표현식]
        * 초기식;
        * while(조건식){
        *   조건을 만족하는 경우 수행할 구문;
        *   증감식;
        * }
        * */

        // 1 ~ 10까지 증가

        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }

    }

    public void testWhileExample1() {

        // 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /*
        * charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 변환
        * length() : String 클래스의 메소드로 문자여르이 길이를 int 형으로 반환
        * index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 하나 작은 숫자를 가짐
        * 만약 존재하지 않는 인덱스에 접근하면 StringIndexOutOfBoundException 발생
        * */

        System.out.println("------ for문 ------");
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
        }

        System.out.println("------ while문 ------");
        int i = 0;
        while(i < str.length()){
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
            i++;
        }

    }

    public void testWhileExample2() {

        // 정수 하나를 입력 받아 1부터 입력한 정수까지의 합계를 구해주세요.
        System.out.print("정수 : ");
        int a = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i <= a){
            sum += i;
            i++;
        }
        System.out.print("합 : " + sum);

    }

    public void testWhileExample3() {

        // 중첩 while을 이용한 구구단 출력
        int dan = 2;
        while(dan < 10) {
            int su = 1;
            while(su < 10){
                System.out.println(dan + " * " + " = " + (dan * su));
                su++;
            }
            System.out.println();
            dan++;
        }

    }

}
