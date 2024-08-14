package main.java.com.ohgiraffers.section03.interfaceImplements;

import java.io.Serializable;
import java.util.Comparator;

public interface InterProduct extends Serializable {

    /*
    * 인터페이스는 상수 필드만 작성 가능하다.
    * public static final 제어자 조합을 상수 필드라고 한다.
    * 하지만, 선언과 동시에 초기화 해 주어야 한다.
    * */

    public static final int MAX_NUM = 100;
    int MIN_NUM = 10;

    // 인터페이스는 생성자를 가질 수 없다.
//    public InterProduct() {}

    /*
    * 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract
    * 의 의미를 가진다. - 다른 접근제어자 사용불가
    * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우
    * 반드시 접근 제어자를 public으로 해야 가능하다.
    * */

    void abstMethod();

    // static 키워드를 이용하여 작성하는 경우는 가능하다.
    public static void staticMethod() {
        System.out.println("interProduct 클래스의 static Method 호출");
    }

}
