package main.java.com.ohgiraffers.question;

import java.util.ArrayList;
import java.util.List;

public class LoginRepository {

    private List<User> users;

    public LoginRepository() {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) throws Exception {
        if(users.size() >= 10) {
            throw new Exception("회원 가입은 10명까지 가능합니다.");
        }
        users.add(user);
    }

    public User findUser(String id, String pwd) throws Exception {
        for(User user : users) {
            if(user.getId().equals(id) && user.getPwd().equals(pwd)) {
                return user;
            }
        }
        return null;
    }

    public boolean hasUser() {
        return !users.isEmpty();
    }

}
