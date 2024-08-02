package section02.variable;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
        * 김경리가 4명의 직원의 월금을 입금해줘야 하는 날이다.
        * 각각 직책은 대리 / 과장 / 차장 / 부장이며,
        * 대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
        * 보너스는 각 월급 * 0.5 만큼을 주어야 한다.
        *
        * 화면에 다음과 같이 출력되게 해주세요
        * ex) 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만월 입금 되었습니다.
        *
        * 4명 다 출력
        * */

        String[] names = {"김대리", "이과장", "최차장", "김부장"};

        int[] salaries = {100, 120, 130, 150};

        for (int i = 0; i < names.length; i++) {
            int salary = salaries[i];
            int bonus = (int) (salary * 0.5);
            int total = salary + bonus;

            System.out.printf("%s의 월급은 %d만원 + 보너스 %d만원으로 총 %d만원 입금 되었습니다.\n",
                    names[i], salary, bonus, total);
        }
    }
}
