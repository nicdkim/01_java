package main.java.com.ohgiraffers.homework.auth.impl;

import main.java.com.ohgiraffers.homework.auth.SnsAuth;
import main.java.com.ohgiraffers.homework.dto.MemberDTO;

import java.util.HashMap;
import java.util.Map;

public class NaverAuth implements SnsAuth {

    private final Map<String, String> users = new HashMap<>();

    @Override
    public boolean login(MemberDTO member) {
        return users.containsKey(member.getId()) &&
                users.get(member.getId()).equals(member.getPwd());
    }

    @Override
    public boolean signUp(MemberDTO membeer) {
        if(users.containsKey(membeer.getId())) {
            return false;
        }
        users.put(membeer.getId(), membeer.getPwd());
        return true;
    }
}