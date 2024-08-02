package section05.typecasting;

public class Question {
    public static void main(String[] args) {

    /*
    * 5명의 반 학생이 있으며 키는 각각
    * 178.5 / 170.3 / 190.7/ 188.67 / 168.8 이다.
    * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다.
    * 소수자리는 절삭한다.
    * */

        double[] heights = {178.5, 170.3, 190.7, 188.67, 168.8};

        double sum = 0;

        for (double height : heights) {
            sum += height;
        }
        System.out.println("sum : " + sum);

        double average = sum / heights.length;
        System.out.println("average : " + average);

        int averageDown = (int)Math.floor(average);
        System.out.println("averageDown : " + averageDown);

        System.out.println("평균 키: " + averageDown + " cm");

        long lnum = 10L;
        int num = 190;

        int sum1 = (int)lnum + num;
        int sum2 = (int)(num+lnum);

        System.out.println("------------------------");

        /*
        * 사업을 시작한 홍길동은 이번 달 매출에서 부가세(10%)를 제외한 소득을 알고싶다.
        *
        * 매출은 다음과 같다.
        * 150400원
        * 1400원
        * 25000원
        * 30000원
        *
        * 다음과 같이 출력 해주세요
        * 홍길동의 총 매출은 --원 입니다.
        * 부가세 제외 소득은 --원 이고 부가세는 --원 입니다.
        * */

        int[] sales = {150400, 1400, 25000, 30000};

        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        System.out.println("totalSales : " + totalSales);

        double vatRate = 0.10;
        double vat = totalSales * vatRate;
        System.out.println("vat : " + vat);

        double incomeExVat = totalSales - vat;
        System.out.println("incomeExVat : " + incomeExVat);

        System.out.println("홍길동의 총 매출은 " + totalSales + "원 입니다.");
        System.out.println("부가세 제외 소득은 " + incomeExVat + "원 이고 부가세는 " + vat + "원 입니다." );


    }
}
