package main.java.com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application04 {
    public static void main(String[] args) {

        /*
        * Stack
        * Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아
        * 구현되었다.
        * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        * 후입선출(LIFO) 방식의 자료 구조라 불린다.
        * */

        Stack<Integer> integerStack = new Stack<>();

        // push() : 값을 넣을 때 이용하는 메소드
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        // search() : 스택에서 요소를 찾는 메소드
        System.out.println(integerStack.search(5));

        /*
        * peak() : 해당 스택의 가장 상단에 있는 요소 반환
        * pop() : 해당 스택의 가장 상단에 있는 요소 반환 후 제거
        * */
        System.out.println("peak() : " + integerStack.peek());
        System.out.println("peak() : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);


    }
}
