package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyRegistry {

    // 1. 객체를 담아둘 주머니 (스프링의 핵심 저장소와 물리적으로 동일함)
    private static final Map<String, Object> container = new ConcurrentHashMap<>();

    // 2. 주머니에 객체를 딱 하나만 넣고 관리하는 로직
    public static <T> T getBean(String name, Class<T> type) {
        if (!container.containsKey(name)) {
            try {
                // 리플렉션을 이용해 사용자 대신 'new'를 해서 주머니에 넣음
                System.out.println(name + " 객체를 처음 만들어 주머니에 넣습니다.");
                Object instance = type.getDeclaredConstructor().newInstance();
                container.put(name, instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 주머니에 이미 있으면 새로 안 만들고 기존 '주소값'만 돌려줌
        return type.cast(container.get(name));
    }
}
