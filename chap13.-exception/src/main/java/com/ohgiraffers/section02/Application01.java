package main.java.com.ohgiraffers.section02;

public class Application01 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {

            // 가진 돈이 음수일 경우
            //et.checkEnoughMoney(10000,-10000);

            // 상품 가격이 음수일 경우
            //et.checkEnoughMoney(-10000, 10000);

            // 가진 돈 보다 상품 가격이 높을 경우
            //et.checkEnoughMoney(10000,5000);

            et.checkEnoughMoney(3000, 5000);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
