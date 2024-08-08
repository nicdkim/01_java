package main.java.com.ohgiraffers.section01.array;

import java.util.Random;
import java.util.Scanner;

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


        // 배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고,
        // 첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. (잘하면 두번째로 큰 값도)
        // 만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두번쨰로 큰 수를 찾을 수 없습니다." 출력


        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이 : ");
        int length = sc.nextInt();

        if(length < 2) {
            System.out.println("1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없습니다.");
        } else {
            int[] arr = new int[length];
            //System.out.print("배열" + length + "의 요소 : ");
            for(int i = 0; i < length; i++) {
                System.out.print("배열[" + length + "]의 요소 : ");
                arr[i] = sc.nextInt();
            }
            int fMax = Integer.MIN_VALUE;
            int sMax = Integer.MAX_VALUE;

            for(int i = 0; i < length; i++) {
                if(arr[i] > fMax) {
                    sMax = fMax;
                    fMax = arr[i];
                } else if(arr[i] > sMax && arr[i] != fMax) {
                    sMax = arr[i];
                }
            }
            System.out.println("첫 번째로 큰 값 : " + fMax);
            if(sMax == Integer.MIN_VALUE) {
                System.out.println("두 번째로 큰 값은 존재하지 않습니다.");
            } else {
                System.out.println("두 번째로 큰 값 : " + sMax);
            }
        }
    }

}
