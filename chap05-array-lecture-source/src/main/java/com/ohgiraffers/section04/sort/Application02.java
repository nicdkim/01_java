package main.java.com.ohgiraffers.section04.sort;

public class Application02 {
    public static void main(String[] args) {

        // 순차정렬
        int[] iarr = {2,5,4,6,1,3};

        for(int i = 1; i < iarr.length; i++) {
            System.out.println("========  i  =========");
            System.out.println("i : " + i);
            System.out.println("iarr[0] : " + iarr[0]);
            System.out.println("iarr[1] : " + iarr[1]);
            System.out.println("iarr[2] : " + iarr[2]);
            System.out.println("iarr[3] : " + iarr[3]);
            System.out.println("iarr[4] : " + iarr[4]);
            System.out.println("iarr[5] : " + iarr[5]);
            System.out.println("========  i  =========");
            for(int j = 0; j < i; j++) {
                System.out.println("========  j  =========");
                System.out.println("j : " + j);
                System.out.println("i : " + i);
                System.out.println("iarr[0] : " + iarr[0]);
                System.out.println("iarr[1] : " + iarr[1]);
                System.out.println("iarr[2] : " + iarr[2]);
                System.out.println("iarr[3] : " + iarr[3]);
                System.out.println("iarr[4] : " + iarr[4]);
                System.out.println("iarr[5] : " + iarr[5]);
                System.out.println("========  j  =========");
                if(iarr[i] < iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }

        System.out.println("------------------------------------");
//        for(int i = 0; i < iarr.length; i++) {
//            System.out.print(iarr[i] + " ");
//        }
//        for (int i = 1; i < iarr.length; i++) {
//            int n = iarr[i];
//            int j = i - 1;
//
//            while (j >= 0 && iarr[j] > n) {
//                iarr[j + 1] = iarr[j];
//                j--;
//            }
//
//            iarr[j + 1] = n;
//        }
//
//        for (int i = 0; i < iarr.length; i++) {
//            System.out.print(iarr[i] + " ");
//        }
    }
}
