package main.java.com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Applicatino01 {
    public static void main(String[] args) {

        // 위에서 배운 예외처리를 가장 많이 사용하는 곳이
        // io(input/output) 패키지이다.

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("test.dat"));
        } catch (FileNotFoundException e) {
            System.out.println("여기서 에러 발생");
            e.printStackTrace();
        }

    }
}
