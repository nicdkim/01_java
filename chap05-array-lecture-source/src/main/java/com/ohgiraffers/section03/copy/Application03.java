package main.java.com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /*
         * 깊은 복사
         * heap에 생성된 배열이 가지고 있는 값을
         * 또 다른 배열에 복사하는 것.
         *
         * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
         * 하나의 배열을 변경 하더라도 다른 배열에는 영향을 주지 않는다.
         *
         * */


        /*
         * 깊은 복사를 하는 방법 4가지
         * 1. for문을 이용한 동일 인덱스 값 복사
         * 2. object의 clone을 이용한 복사
         * 3. System의 arrayCopy()를 이용한 복사
         * 4. Array의 copyOf()를 이용한 복사
         * */

        int[] originArr = {1,2,3,4,5};
        print(originArr);

        // 1. for문을 이용한 동일 인덱스 값 복사
        int[] copyArr1 = new int[10];
        for(int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        // 2. Object의 clone()을 이용한 복사
        System.out.println("Object clone : ");
        int[] copyArr2 = originArr.clone();
        print((copyArr2));

        // 3. System의 arrycopy()을 이용한 복사
        System.out.println("arrycopy() : ");
        int[] copyArr3 = new int[10];
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
        print((copyArr3));

        // 4. Arrays copyOf()를 이용한 복사
        System.out.println("copyOf : ");
        int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);
        print((copyArr4));
    }

    public static void print(int[] iarr) {
        System.out.println("iarr.hashCode() : " + iarr.hashCode());

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

}
