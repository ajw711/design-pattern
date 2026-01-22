package template;

public class BlackCoffee extends Beverage {

    @Override
    protected void brew() { System.out.println("커피 원두를 진하게 내리는 중..."); }

    @Override
    protected void addCondiments() { /* 아무것도 안 함 */ }

    // 부모의 선택권을 덮어씀 (설탕 빼주세요!)
    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
