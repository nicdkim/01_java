package main.java.com.ohgiraffers.question;

public class LoginService {

    private LoginRepository repository;

    public LoginService(LoginRepository repository) {
        this.repository = repository;
    }

    public void singUp(String id, String name, String pwd, String pwdCheck) throws Exception{
        if(!pwd.equals(pwdCheck)) {
            throw new Exception("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
        }

        User user = new User(id,name,pwd);
        repository.addUser(user);
    }

    public boolean login(String id, String pwd) {
        if (!repository.hasUser()) {
            System.out.println("가입한 회원이 없습니다.");
            return false;
        }

        try {
            User user = repository.findUser(id, pwd);

            if (user != null) {
                System.out.println("로그인 완료");
                return true;
            } else {
                System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("로그인 중 오류가 발생했습니다: " + e.getMessage());
            return false;
        }
    }

}
