package flyweight;

public class TreeType {
    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 객체의 고유 식별값(메모리 주소 기반 해시)을 반환
    public String getIdentifier() {
        return Integer.toHexString(System.identityHashCode(this));
    }
}
