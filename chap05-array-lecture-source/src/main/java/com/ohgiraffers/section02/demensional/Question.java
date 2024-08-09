package main.java.com.ohgiraffers.section02.demensional;

import java.util.Arrays;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
        * 배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만든 후,
        * 배열에서 중복된 값을 모두 제거한 후 남은 값을 오름차순으로 출력하는 프로그램을 작성하세요.
        * 만약 배열의 길이가 0이면 "빈 배열입니다."를 출력하세요.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이: ");
        int length = sc.nextInt();

        if (length == 0) {
            System.out.println("빈 배열입니다.");
            return;
        }

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("배열[" + length + "]의 요소 :");
            arr[i] = sc.nextInt();
        }

        int[] tArr = new int[length];
        int nSize = 0;

        for (int i = 0; i < length; i++) {
            boolean isDup = false;

            for (int j = 0; j < nSize; j++) {
                if (arr[i] == tArr[j]) {
                    isDup = true;
                    break;
                }
            }

            if (!isDup) {
                tArr[nSize++] = arr[i];
            }
        }

        for (int i = 0; i < nSize - 1; i++) {
            for (int j = i + 1; j < nSize; j++) {
                if (tArr[i] > tArr[j]) {
                    int temp = tArr[i];
                    tArr[i] = tArr[j];
                    tArr[j] = temp;
                }
            }
        }
        System.out.print("결과 :");
        for (int i = 0; i < nSize; i++) {
            System.out.print(tArr[i] + " ");
        }
    }

//        System.out.print("배열의 길이 : ");
//        int length = sc.nextInt();
//
//        if (length == 0) {
//            System.out.println("빈 배열입니다.");
//        } else {
//            int[] arr = new int[length];
//            for (int i = 0; i < length; i++) {
//                System.out.print("배열[" + length +"]의 요소 : ");
//                arr[i] = sc.nextInt();
//            }
//            int[] uArr = removeDup(arr);
//            Arrays.sort(uArr);
//
//            System.out.print("결과 : ");
//            for (int n : uArr) {
//                System.out.print(n + " ");
//            }
//        }
//    }
//
//    public static int[] removeDup(int[] arr) {
//        return Arrays.stream(arr).distinct().toArray();
//    }
}
