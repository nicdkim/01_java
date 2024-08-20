package main.java.com.ohgiraffers.section01.exception;

public class Application02 {
    public static void main(String[] args) {

        // try-catch를 이용한 예외처리
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(10000, 15000);
            et.checkEnoughMoney(10000, 5000);
            System.out.println("== 상품 구입 가능 ==");
        } catch (Exception e) {
            System.out.println("money가 price보다 작습니다.");
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
