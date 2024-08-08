package main.java.com.ohgiraffers.section01.array;

import java.util.Random;

public class Question {
    public static void main(String[] args) {

        // 트럼프 카드를 랜덤으로 한장 출력해보자
        String[] patterns = {"스페이드", "하트", "다이아", "클로버"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8"
        , "9", "10", "J", "Q", "K"};

        Random r = new Random();
        String pattern = patterns[r.nextInt(patterns.length)];
        String rank = ranks[r.nextInt(ranks.length)];
        System.out.println("카드 : " + (pattern + " " + rank));
    }
}
