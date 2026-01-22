package singleton;

public class Singleton {

    public static void main(String[] args) {
        // --- 1. Classic 생성 방식 테스트 ---
        ClassicSingleton s1 = ClassicSingleton.getInstance();
        ClassicSingleton s2 = System.currentTimeMillis() > 0 ? ClassicSingleton.getInstance() : null;
        System.out.println("고전 방식 주소값 동일 여부: " + (s1 == s2)); // true

        // --- 2. Map 주머니 방식 테스트 ---
        // MyService 클래스가 평범한 public 클래스여도 주머니를 거치면 하나만 유지
        MyService service1 = MyRegistry.getBean("myService", MyService.class);
        MyService service2 = MyRegistry.getBean("myService", MyService.class);
        System.out.println("Map 방식 주소값 동일 여부: " + (service1 == service2)); // true
    }
}

class MyService {
    public MyService() { }
}