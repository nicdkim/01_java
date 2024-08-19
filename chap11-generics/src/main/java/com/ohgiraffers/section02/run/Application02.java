package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.*;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 와일드카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로
        * 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
        *
        * <?> : 제한 없음
        * <? etends Type> : 와일드 카드의 상한 제한
        * <? super Type> : 와일드 카드 하한 제한
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

        // 1. anyType
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkBunny()));

        // 2. extendsType
//        wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkBunny()));

        // 3. superType
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkBunny>(new DrunkBunny()));


    }
}
