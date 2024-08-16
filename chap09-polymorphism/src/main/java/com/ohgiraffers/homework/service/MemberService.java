package main.java.com.ohgiraffers.homework.service;

import main.java.com.ohgiraffers.homework.auth.SnsAuth;
import main.java.com.ohgiraffers.homework.dto.MemberDTO;

public class MemberService {
    private final SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {

        this.snsAuth = snsAuth;
    }

    public boolean findMember(MemberDTO member) {

        return snsAuth.login(member);
    }

    public boolean addMember(MemberDTO member) {
        return snsAuth.signUp(member);
    }
}