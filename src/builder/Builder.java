package builder;

import builder.after.AfterUser;
import builder.before.BeforeUser;

public class Builder {

    public static void main(String[] args) {

        // - 값이 null이어도 자리를 채워줘야 함
        BeforeUser userBefore = new BeforeUser("홍길동", 25, "hong@test.com", "010-1234-5678");

        AfterUser userAfter = new AfterUser.Builder()
                .name("이순신")
                .age(30)
                .email("lee@test.com")
                // phoneNumber는 필요 없으면 호출하지 않아도 됨
                .build();

        System.out.println("userBefore = " + userBefore);
        System.out.println("userAfter = " + userAfter);
        System.out.println("빌더 패턴으로 객체 생성 성공!");
    }


}
