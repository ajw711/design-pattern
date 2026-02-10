package flyweight;

public class TreeAfter {
    private int x;
    private int y;
    private TreeType type;

    public TreeAfter(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void printInfo(int id) {
        System.out.println(String.format("[%d번 나무] 좌표: (%d,%d) | TreeType 주소값: %s",
                id, x, y, type.getIdentifier()));
    }
}
