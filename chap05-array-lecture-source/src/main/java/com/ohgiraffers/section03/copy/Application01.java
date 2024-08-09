package main.java.com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 배열의 복사는 크게 두 종류가 있다.
        * 1. 얕은 복사 (shallow copy) : stack의 주소 값만 복사
        * 2. 깊은 복사 (deep copy) : heap의 배열에 저장된 값을 복사
        *
        *
        * */

        int[] orginalArr = {1,2,3,4,5};
        int[] copyArr = orginalArr;

        System.out.println(orginalArr.hashCode());
        System.out.println(copyArr.hashCode());

        copyArr[0] = 99;

        for(int x : orginalArr) {
            System.out.println(x + " ");
        }

        System.out.println();
        for(int y : copyArr) {
            System.out.println(y + " ");
        }

    }
}
