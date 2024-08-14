package main.java.com.ohgiraffers.section04.use2;

public class SuperDice implements Dice{

    private int min;
    private int max;

    public SuperDice() {
        this.min = 10;
        this.max = 1;
    }

    @Override
    public int getNumber() {
        return (int)(Math.random() * 10) + 1;
    }
}
