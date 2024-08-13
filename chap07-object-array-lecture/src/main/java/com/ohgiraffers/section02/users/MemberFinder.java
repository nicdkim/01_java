package main.java.com.ohgiraffers.section02.users;

public class MemberFinder { // 멤버를 찾는 명령을 레파지토리에 내리는 클래스

    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
    }

}
