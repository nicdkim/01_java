package main.java.com.ohgiraffers.section01.method;

public class Application06 {
    public static void main(String[] args) {

        /*
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return; 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀할 때는 그냥 할 수도 있지만, 값을 가지고 복귀할 수 있다.
        * 이 때 가지고 가는 값을 리턴값 이라고 한다.
        *
        * return 값을 반환하기 위해서는 메소드 선언부에 리턴 타입을 명시 해 주어야 한다.
        * void는 아무 반환값을 가지지 않겠다는 리턴값에 사용할 수 있는 키워드이다.
        * 반환값이 없는 경우 return을 생략해도 컴파일러가 자동으로 추가하지만,
        * 반환값이 있는 경우 return 구문을 반드시 명시적으로 작성 해야한다.
        * 또한 메소드 선언부에 선언한 리턴타입과 반환값의 자료형은 반드시 일치해야 한다.
        * */

        Application06 app6 = new Application06();
        String returnValue = app6.test();
        System.out.println(returnValue);
        System.out.println(app6.test());
    }

    public String test(){

        // public 뒤에 바로 return 값을 가지고 갈 타입을 명시한다.
        return "Hello World";
    }
}
