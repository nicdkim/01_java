package main.java.com.ohgiraffers.question;

import java.util.Scanner;
import java.util.Stack;

public class Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        int n = sc.nextInt();
        int[] sequence = new int[n];


        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder operations = new StringBuilder();

        int currentNumber = 1;
        boolean isPossible = true;
        for (int num : sequence) {

            while (currentNumber <= num) {
                stack.push(currentNumber++);
                operations.append("+ ");
            }

            if (stack.peek() == num) {
                stack.pop();
                operations.append("- ");
            } else {

                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(operations.toString());
        } else {
            System.out.println("NO");
        }
    }
}

