package main.java.com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 전달인자(argument = arg), 매개변수(parameter)를 이용한 메소드 호출
        *
        *   변수의 종류
        *   1. 지역 변수            // 메소드 내에 존재하는 변수
        *   2. 매개 변수            // 일종의 지역 변수 - 메소드 내부에서만 사용 가능
        *   3. 전역 변수 (필드)
        *   4. 클래스(static) 변수
        *
        *   지역 변수는 선언한 메소드 블록 내부에서만 사용 가능하다.
        *   이것을 지역변수의 스코프라고 한다. - {}
        *   다른 메소드간 서로 공유해야 하는 값이 존재하는 경우
        *   메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        *   이 때 전달하는 값을 전달인다(argument)라고 부르고,
        *   메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를
        *   매개변수(parameter)라고 한다.
        * */


        Application03 app3 = new Application03();

        // 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형, 갯수, 순서가 일치하게 값을 넣어 호출한다.
        app3.testMethod(20);
        //app3.testMethod(20, 30);    // 갯수가 일치하지 않으면 호출할 수 없다.
        //app3.testMethod("30");      // 자료형이 일치하지 않으면 호출할 수 없다.
        //app3.testMethod();          // 매개변수가 있지만 인자로 값을 전달하지 않으면 호출할 수 없다.

        // 변수에 저장한 값 전달
        int age = 20;
        app3.testMethod(age);

        // 자동 형변환을 이용한 값 전달
        byte byeAge = 20;
        app3.testMethod(byeAge);

        // 강제 형변환을 이용한 값 전달
        long longAge = 30L;
        app3.testMethod((int)longAge);

        // 연산 결과를 이용해서 값 전달
        app3.testMethod(byeAge*30);
    }


    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }

}
