package main.java.com.ohgiraffers.section01.conditional.question;

public class Cal {
    public double avrage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public boolean isPass(double ave, int a, int b, int c){
        if(ave >= 60 && a >=40 && b>=40 && c >=40) {
            return true;
        } else {
            return false;
        }
    }
}
