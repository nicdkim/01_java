package main.java.com.ohgiraffers.homework;

import main.java.com.ohgiraffers.homework.auth.SnsAuth;
import main.java.com.ohgiraffers.homework.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.homework.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.homework.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.homework.dto.MemberDTO;
import main.java.com.ohgiraffers.homework.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberService = null;
        boolean result;
        SnsAuth snsAuth = null;

        while (true) {
            System.out.println("------------ 인증 방식을 선택하세요 ------------");
            System.out.println("| 1. Google | 2. Kakao | 3. Naver | 9. 종료 |");
            System.out.println("--------------------------------------------");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 9) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            switch (choice) {
                case 1:
                    snsAuth = new GoogleAuth();
                    break;
                case 2:
                    snsAuth = new NaverAuth();
                    break;
                case 3:
                    snsAuth = new KakaoAuth();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
                    continue;
            }

            memberService = new MemberService(snsAuth);

            while (true) {
                System.out.println("---------------- 메뉴 ---------------");
                System.out.println("| 1 : 로그인 | 2 : 회원가입 | 9 : 종료 |");
                System.out.println("------------------------------------");
                System.out.print("선택 : ");
                int action = sc.nextInt();
                sc.nextLine();

                if (action == 9) {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }

                System.out.print("아이디를 입력하세요: ");
                String id = sc.nextLine();
                System.out.print("비밀번호를 입력하세요: ");
                String pwd = sc.nextLine();
                MemberDTO memberDTO = new MemberDTO(id, pwd);

                if (action == 1) {
                    switch (choice) {
                        case 1:
                            memberService = new MemberService(new GoogleAuth());
                            result = memberService.findMember(memberDTO);
                            if (result) {
                                System.out.println("google로그인에 성공하였습니다. " + memberDTO.getId());
                                return;
                            }
                            break;
                        case 2:
                            memberService = new MemberService(new NaverAuth());
                            result = memberService.findMember(memberDTO);
                            if (result) {
                                System.out.println("naver로그인에 성공하였습니다. " + memberDTO.getId());
                                return;
                            }
                            break;
                        case 3:
                            memberService = new MemberService(new KakaoAuth());
                            result = memberService.findMember(memberDTO);
                            if (result) {
                                System.out.println("kakao로그인에 성공하였습니다.. " + memberDTO.getId());
                                return;
                            }
                            break;
                        case 9:
                            System.out.println("로그인을 종료합니다.");
                            return;
                    }
                    System.out.println("인증된 회원이 없습니다.");
                } else if (action == 2) {
                    if (memberService.addMember(memberDTO)) {
                        System.out.println("회원가입이 완료되었습니다.");
                    } else {
                        System.out.println("이미 존재하는 회원입니다.");
                    }
                } else {
                    System.out.println("잘못된 선택입니다.");
                }
            }
        }
    }
}