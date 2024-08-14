package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

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
    public boolean signUp(MemberDTO member) {
        if(users.containsKey(member.getId())) {
            return false;
        }
        users.put(member.getId(), member.getPwd());
        return true;
    }
}
