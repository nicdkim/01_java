package main.java.com.ohgiraffers.section02.understand.employee;

import main.java.com.ohgiraffers.section02.understand.car.Car;
import main.java.com.ohgiraffers.section02.understand.car.ElectricCar;

public class Seller {

    private String name;
    private double result; // 판매 수당

    public Seller(String name) {
        this.name = name;
    }

    public void sale(Car[] cars) {
        for (Car car : cars) {
            if(car instanceof ElectricCar) {
                System.out.println(car.getBrand() + "사의" +
                        car.getName() + "를 판매 하였습니다.");
                result += car.getPrice();
            } else {
                System.out.println(car.getBrand() + "사의" +
                        car.getName() + "를 판매 하였습니다.");
                result += car.getPrice();
            }
        }
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';
    }
}
