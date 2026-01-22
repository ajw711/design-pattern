package singleton;

public class ClassicSingleton {

    // 1. 딱 하나만 존재할 주소값을 담을 정적 칸 (메모리 로딩 시 생성됨)
    private static final ClassicSingleton INSTANCE = new ClassicSingleton();

    // 2. 외부에서 'new'를 못하게 막는 철문 (생성자를 숨김)
    private ClassicSingleton() {
        System.out.println("본체(Real)가 단 한 번 생성되었습니다.");
    }

    // 3. 주소값을 꺼내주는 유일한 구멍
    public static ClassicSingleton getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("고전 싱글톤입니다.");
    }
}
