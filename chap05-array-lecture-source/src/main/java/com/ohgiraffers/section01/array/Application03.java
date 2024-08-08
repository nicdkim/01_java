package main.java.com.ohgiraffers.section01.array;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 값의 형태 별 기본값
        * 정수 : 0
        * 실수 : 0.0
        * 논리 : false
        * 문자 : \u0000
        * 참조 : null
        * */

        int[] iarr = new int[5];
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr [" + i + "] 의 값 : " + iarr[i]);
        }

        /*
        * 자바에서 기본 값 외의 값으로 초기화를 하고 싶은 경우 블럭 {}을 이용한다.
        * 블럭을 사용하는 경우에는 new를 사용하지 않아도 되며, 값의 갯수만큼
        * 자동으로 크기가 설정된다.
        * */

        int[] iarr2 = {11, 22, 33, 44, 55};
        int[] iarr3 = new int[]{11, 22, 33, 44, 55};

        System.out.println("iarr2.length : " + iarr2.length);
        System.out.println("iarr3.length : " + iarr3.length);

        // 문자열도 배열로 사용할 수 있다.
        String[] sarr = {"apple", "banana", "grape", "orange"};

        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "]의 값 : " + sarr[i]);
        }
    }
}
