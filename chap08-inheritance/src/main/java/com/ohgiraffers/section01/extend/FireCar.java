package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    public FireCar() {
        super();
    }

    @Override
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빠아아아아아아앙");
        } else {
            System.out.println("소방차가 멈춰있습니다.");
        }
    }

    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }
}
