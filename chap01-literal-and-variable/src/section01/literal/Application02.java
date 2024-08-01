package section01.literal;
import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        // 정수 리터럴 연산 형식의 값을 연산 한다.

        /*
            123 + 123
            123 - 456
            123 + 456
            48 / 10
            10 % 2
        */
        System.out.println(123 + 123);
        System.out.println(123 - 456);
        System.out.println(123 + 456);
        System.out.println(48 / 10);
        System.out.println(10 % 2);

        System.out.println("-----------------------");

        // 실수와 정수 연산
        System.out.println(1 + 0.5);
        System.out.println(1 - 0.5);
        System.out.println(1 * 0.5);
        System.out.println(1 / 0.5);    // 2.0 = 실수가 정수보다 큰 개념, 실수는 정수가 될 수 없다. 따라서 결과값은 실수로 연산
        System.out.println(1 % 0.5);

        System.out.println("-----------------------");

        // 문자와 문자의 연산
        // 컴퓨터는 문자를 인식하지 못하시 때문에 대응되는 숫자들이 있다
        // (아스키코드(영어), 유니코드(전세계언어))
        System.out.println('a' + 'b');
        System.out.println('ㄱ' + 'ㄴ');
        
        // 문자열은 + 연산만 가능하다.
        // 데이터 값이 다를 때는 자동 형변환을 통해 최상위 타입으로 변경된다.
        // (문자열이 최상위 타입)

        System.out.println("------ 문자 열과 다른 형태의 값 연산 ------");

        System.out.println("hello" + 1004);
        System.out.println("hello" + true);

        System.out.println("hello" + (123 + 456) + "world");

        System.out.println("-----------------------");

        // 논리형 연산
        // System.out.println(true + 1);       불가능
        // System.out.println(true + false);   불가능
        System.out.println(true + "false");




















        /*Scanner scanner = new Scanner(System.in);
        System.out.print("몇 층?: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    try{
        System.out.print("첫 번째 숫자: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;

        System.out.println("곱셈 결과: " + result);
    } finally {
        scanner.close();
    }

        int [] arr = {10, 50, 30, 100, 4, 100, 1000};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println("가장 큰 수 : " + max);
        System.out.println("가장 작은 수 : " + min);
    */
    }
}
