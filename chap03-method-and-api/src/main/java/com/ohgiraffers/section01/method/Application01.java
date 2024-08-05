package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {    // 메소드

        /*
        * 메소드란 ?
        * 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main() 메소드 시작됨...");

        Application01 app1 = new Application01();
        app1.methodA(); // static 메소드에서 static이 없는 메소드를 호출할 때 이렇게 작성을 해야 한다는 규칙

//        int a = app1.plus(1,2);
//        System.out.println(a);

        System.out.println("main() 메소드 종료됨...");


    }

    public void methodA(){
        System.out.println("methodA() 호출됨");

        methodB();

        System.out.println("methodA() 종료됨");
    }
    
    public void methodB(){
        System.out.println("methodB() 호출됨");

        methodC();

        System.out.println("methodB() 종료됨");
    }

    public void methodC(){
        System.out.println("methodC() 호출됨");
        System.out.println("methodC() 종료됨");
    }

//    public int plus(int a, int b){
//        return a + b;
//    }
}
