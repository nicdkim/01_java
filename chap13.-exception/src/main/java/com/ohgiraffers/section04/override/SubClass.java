package main.java.com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    // 예외 없이 오버라이드 할 수 있다.
    /*
    @Override
    public void method() {} // 정상
    */

    // 같은 예외를 던져주는 구문으로 오버라이딩 할 수 있다.
    /*
    @Override
    public void method() throws IOException {} // 정상
    */

    // 부모의 예외보다 상위의 예외로는 할 수 없다.
    /*
    @Override
    public void method() throws Exception{} // 비정상
    */

    // 하지만 하위로는 할 수 있다. (즉 더 구체적인 상황)

    @Override
    public void method() throws FileNotFoundException {}


}
