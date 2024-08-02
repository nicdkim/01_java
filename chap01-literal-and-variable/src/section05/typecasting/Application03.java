package section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 계산
        * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        * */

        int inum = 10;
        long lnum = 10L;

        long result = inum + lnum;
        int result2 = (int)(inum + lnum);
        System.out.println(result2);

        byte bnum = 1;
        short snum = 2;

        short result4 = (short)(bnum + snum);
        System.out.println("result4 : " + result4);


        long lnum3 = 3L;
        int result5 = (int)(bnum + lnum3);
        System.out.println("result5 : " + result5);

    }
}
