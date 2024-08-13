package main.java.com.ohgiraffers.section02.users;

public class MemberRepository { // 데이터베이스 대용. 실제 테이터 수행부

    private final static Member[] members = new Member[10];

    private static int count;

    public static boolean store(Member[] newMember) {
        for(int i = 0; i < newMember.length; i++) {
            if(count != 10) {
                members[count++] = newMember[i];
            } else {
                System.out.println("정원 초과");
                return false;
            }
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }

}
