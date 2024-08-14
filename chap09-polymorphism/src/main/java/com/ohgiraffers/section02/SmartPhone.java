package main.java.com.ohgiraffers.section02;

public class SmartPhone extends Product{

    public SmartPhone() {

    }
    
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 추상메소드를 호출함");
    }
    
    public void printSmartPhone() {
        System.out.println("SmartPhone의 print 메소드를 호출함");
    }



}
