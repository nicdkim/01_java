package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.*;

public class Application {
    public static void main(String[] args) {

        /*
        * 제네릭 클래스 작성 시 extends 키워드를 사용하면
        * 특정 타입만 사용하도록 제한을 걸 수 있다.
        * */

//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> farm1 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm1 = new RabbitFarm<Snake>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<Rabbit>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<Bunny>();
        RabbitFarm<DrunkBunny> farm6 = new RabbitFarm<DrunkBunny>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkBunny());
        farm6.getAnimal().cry();
    }
}
