package main.java.com.ohgiraffers.section04.sort;

public class Application03 {
    public static void main(String[] args) {

        // 선택 정력
        int[] iarr = {2,5,4,1,6,3};

        int min;
        int temp;

        for(int i = 0; i < iarr.length; i++) {
            min = i;
            for(int j = i + 1; j < iarr.length; j++) {
                if (iarr[min] > iarr[j]) {
                    min = j;
                }
            }
            temp = iarr[min];
            iarr[min] = iarr[i];
            iarr[i] = temp;
        }
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
