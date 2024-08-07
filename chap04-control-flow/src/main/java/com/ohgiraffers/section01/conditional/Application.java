package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
        B_ifElse b = new B_ifElse();
        C_ifElseIf c = new C_ifElseIf();
        //a.testSimpleIfStatement();

        //a.testNestedIfStatement();

        //b.testSimpleIfElseStatement();

        //b.testNestedIfElseStatement();

        //c.testSimpleIfElseIfStatement();

        c.testNestedIfElseIfStatement();
    }
}
