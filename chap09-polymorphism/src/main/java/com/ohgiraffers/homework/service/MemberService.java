package main.java.com.ohgiraffers.homework.service;

import main.java.com.ohgiraffers.homework.auth.SnsAuth;
import main.java.com.ohgiraffers.homework.dto.MemberDTO;

import java.util.HashMap;
import java.util.Map;

public class MemberService {
    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }

    public boolean addMember(MemberDTO memberDTO) {
        return snsAuth.signUp(memberDTO);
    }

    public boolean findMember(MemberDTO memberDTO) {
        return snsAuth.login(memberDTO);
    }

}
