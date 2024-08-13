package main.java.com.ohgiraffers.section02.users;

import java.util.Scanner;

public class Application {  // 프로그램 실행부
    public static void main(String[] args) {

        /*
        * 여러 명의 회원 정보를 한번에 등록
        * 전체 회원 조회 시 여러 명의 회원 정보를 한 번에 반환
        *
        * MemberRepository - static 필드로 회원 정보들을 저장 (최대 10명까지)
        * */

        Scanner sc = new Scanner(System.in); // 사용자의 입력을 받기 위함

        MemberService memberService = new MemberService();
        // 객체를 heap에 생성하여 메소드를 실행할 준비.

        loop: while(true) {
            System.out.println("==== 회원 관리 프로그램 ====");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1 :    /* service에게 내릴 1번 명령 */
                    memberService.signUpMember();
                break;
                case 2 :     /* service에게 내릴 2번 명령 */
                    memberService.showAllMembers();
                break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                break loop;
                default :
                    System.out.println("잘못된 번호입니다.");
                break;

            }
        }
    }
}
