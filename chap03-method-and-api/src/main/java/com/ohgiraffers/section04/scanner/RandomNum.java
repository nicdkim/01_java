package main.java.com.ohgiraffers.section04.scanner;

public class RandomNum {
    public String oddEven(int num) {
        return num == 0 ? "X는 0입니다." :
                num > 0 ? (num % 2 == 0 ? "X는 양수이면서 짝수입니다." :
                        "X는 양수이면서 홀수입니다.") :
                        (num % 2 == 0 ? "X는 음수이면서 짝수입니다." :
                                "X는 음수이면서 홀수입니다.");

//        if (num > 0) {
//            if (num % 2 == 0) {
//                return "X는 양수이면서 짝수입니다.";
//            } else {
//                return "X는 양수이면서 홀수입니다.";
//            }
//        } else if (num < 0) {
//            if (num % 2 == 0) {
//                return "X는 음수이면서 짝수입니다.";
//            } else {
//                return "X는 음수이면서 홀수입니다.";
//            }
//        } else {
//            return "X는 0입니다.";
//        }
    }
}






