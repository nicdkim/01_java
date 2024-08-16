package main.java.com.ohgiraffers.homework.auth;

import main.java.com.ohgiraffers.homework.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO member);

    boolean signUp(MemberDTO membeer);

}