package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Flyweight {

    public static void main(String[] args) {
        int count = 5;

        System.out.println("=== [Before] 패턴 적용 전: 모든 객체가 데이터를 각각 들고 있음 ===");
        List<TreeBefore> beforeList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            TreeBefore tree = new TreeBefore("소나무", "초록색", i, i);
            beforeList.add(tree);
            // Before는 내부 필드가 private이라 주소값을 찍으려면 별도의 메서드가 필요함
            System.out.println(String.format("[%d번] 객체 자체 주소: %s",
                    i, Integer.toHexString(System.identityHashCode(tree))));
        }

        System.out.println("\n=== [After] 패턴 적용 후: TreeFactory를 통해 공통 데이터 공유 ===");
        List<TreeAfter> afterList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            // TreeFactory를 사용하여 동일한 TreeType 인스턴스를 가져옴
            TreeType sharedType = TreeFactory.getType("소나무", "초록색");
            TreeAfter tree = new TreeAfter(i, i, sharedType);
            afterList.add(tree);

            // printInfo 메서드로 공유되는 주소값 확인
            tree.printInfo(i);
        }
    }
}
