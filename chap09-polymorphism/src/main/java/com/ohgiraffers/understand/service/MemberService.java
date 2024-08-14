package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class MemberService {

    public boolean login(MemberDTO member, SnsAuth snsAuth) {
        return snsAuth.login(member);
    }

    public boolean signUp(MemberDTO member, SnsAuth snsAuth) {
        return snsAuth.signUp(member);
    }

}
