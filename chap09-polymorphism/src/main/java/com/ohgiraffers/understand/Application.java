package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();
        SnsAuth snsAuth = null;

        while (true) {
            System.out.println("------------ 인증방식을 선택하세요 ------------");
            System.out.println("| 1. Google | 2. Kakao | 3. Naver | 0. 종료 |");
            System.out.println("-------------------------------------------");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1 -> snsAuth = (snsAuth instanceof GoogleAuth) ?
                snsAuth : new GoogleAuth();
                case 2 -> snsAuth = (snsAuth instanceof KakaoAuth ) ?
                snsAuth : new KakaoAuth();
                case 3 -> snsAuth = (snsAuth instanceof NaverAuth) ?
                snsAuth : new NaverAuth();
                default -> {
                    System.out.println("잘못된 선택입니다.");
                    continue;
                }
            }

//        if(memberService.login(member, snsAuth)) {
//            System.out.println(snsAuth.getClass().getSimpleName() +
//                    "에 인증된 " + id + "님 환영합니다.");
//        } else {
//            System.out.println(snsAuth.getClass().getSimpleName() +
//                    "에 인증된 회원이 없습니다.");
//        }

            System.out.println("------------------ 메뉴 ------------------");
            System.out.println("| 1. 로그인 | 2. 회원가입 | 0. 인증 방식 변경 |");
            System.out.println("-----------------------------------------");
            System.out.print("선택 : ");
            int action = sc.nextInt();
            sc.nextLine();

            if (action == 0) {
                continue;
            }

            System.out.print("아이디를 입력하세요 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호를 입력하세요 : ");
            String pwd = sc.nextLine();

            MemberDTO member = new MemberDTO(id, pwd);

            if (action == 1) {
                if (memberService.login(member, snsAuth)) {
                    System.out.println(snsAuth.getClass().getSimpleName() + "에 인증된 " + id + "님 환영합니다.");
                } else {
                    System.out.println(snsAuth.getClass().getSimpleName() + " 인증된 회원이 없습니다.");
                }
            } else if (action == 2) {
                if (memberService.signUp(member, snsAuth)) {
                    System.out.println(snsAuth.getClass().getSimpleName() + "에 회원가입이 완료되었습니다.");
                } else {
                    System.out.println(snsAuth.getClass().getSimpleName() + " 이미 존재하는 회원입니다.");
                }
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}

