package strategy.after;

public class NaverPayStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("네이버페이로 " + amount + "원 결제합니다.");
    }
}
