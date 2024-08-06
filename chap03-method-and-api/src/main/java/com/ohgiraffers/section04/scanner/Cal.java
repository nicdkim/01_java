package main.java.com.ohgiraffers.section04.scanner;

public class Cal {

    public double add (double a, double b) {
        return a + b;
    }

    public double sub (double a, double b) {
        return a - b;
    }

    public double mul (double a, double b) {
        return a * b;
    }

    public double div (double a, double b) {
        if (b == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        } else {
            return a / b;
        }
    }

    public double remain (double a, double b) {
        return a % b;
    }



}
