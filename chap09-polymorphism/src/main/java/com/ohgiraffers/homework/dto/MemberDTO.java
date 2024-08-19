package main.java.com.ohgiraffers.homework.dto;

public class MemberDTO {
    private String id;
    private String pwd;

    public MemberDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {

        return id;
    }

    public String getPwd() {

        return pwd;
    }
}