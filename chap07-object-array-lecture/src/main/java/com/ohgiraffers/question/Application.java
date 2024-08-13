package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application {

    private LoginService loginService;

    public static void main(String[] args) {
        Application app = new Application();
        app.run();

    }
    public Application() {
        this.loginService = new LoginService(new LoginRepository());
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. 회원 가입");
            System.out.println("2. 로그인");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1) {
                handleSignUp(sc);
            } else if (choice == 2) {
                if(handleLogin(sc)) {
                    break;
                }
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public void handleSignUp(Scanner sc) {
        try {
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("비밀번호 : ");
            String pwd = sc.nextLine();
            System.out.print("비밀번호 확인 : ");
            String pwdCheck = sc.nextLine();

            loginService.singUp(id, name, pwd, pwdCheck);
            System.out.println("회원가입이 완료되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean handleLogin(Scanner sc) {
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pwd = sc.nextLine();
        return loginService.login(id,pwd);
    }

}
