package template;

public abstract class Beverage {

    // [템플릿 메서드] 순서를 못 박아버림 (final로 선언해 자식이 순서를 못 바꾸게 함)
    public final void prepareRecipe() {
        boilWater();       // 1. 물 끓이기 (공통)
        brew();            // 2. 우려내기 (자식마다 다름 - 필수)
        pourInCup();       // 3. 컵에 붓기 (공통)
        if (customerWantsCondiments()) { // 4. 첨가물 (선택 - Hook)
            addCondiments();
        }
    }

    // 모든 음료가 공통으로 사용하는 '이미 완성된 부품'
    private void boilWater() { System.out.println("물 끓이는 중..."); }
    private void pourInCup() { System.out.println("컵에 붓는 중..."); }

    // 자식이 반드시 자기 색깔로 채워야 하는 '구멍' (추상 메서드)
    protected abstract void brew();
    protected abstract void addCondiments();

    // 해도 되고 안 해도 되는 선택권 (기본값은 true)
    protected boolean customerWantsCondiments() {
        return true;
    }
}
