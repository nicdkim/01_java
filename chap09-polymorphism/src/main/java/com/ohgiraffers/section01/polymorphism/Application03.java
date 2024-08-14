package main.java.com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args) {

        // 다형성을 적용하여 매개변수에 활용

        Animal animal = new Rabbit();
        Animal animal1 = new Tiger();

        Application03 app3 = new Application03();

        app3.feed(animal);
        app3.feed(animal1);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        app3.feed(rabbit);
        app3.feed(tiger);

        app3.feed(new Tiger());
        app3.feed(new Rabbit());

    }

    public void feed(Animal animal) {
        animal.eat();
    }

}
