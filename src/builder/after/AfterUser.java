package builder.after;

public class AfterUser {
    private String name;
    private int age;
    private String email;

    // 1. 외부에서 직접 생성을 못하도록 생성자를 private으로 설정
    private AfterUser() {}

    public static class Builder {
        // 빌더가 임시로 값을 들고 있음
        private String name;
        private int age;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        // 2. 최종적으로 객체를 생성하여 반환
        public AfterUser build() {
            AfterUser user = new AfterUser();
            user.name = this.name;
            user.age = this.age;
            user.email = this.email;
            return user;
        }
    }
}