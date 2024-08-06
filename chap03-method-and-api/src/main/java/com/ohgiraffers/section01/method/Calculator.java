package main.java.com.ohgiraffers.section01.method;

import java.util.Scanner;

public class Calculator {


    // 둘 중 작은 값을 리턴
    public int minNumberOf(int first, int second) {
        return (first > second) ? second : first;

    }

    // 둘 중 큰 값을 리턴
    public static int maxNumberOf(int first, int second) {
        return (second > first) ? second : first;

    }

}
