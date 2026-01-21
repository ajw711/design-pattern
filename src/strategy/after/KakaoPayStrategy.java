package strategy.after;

public class KakaoPayStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원 결제합니다.");
    }
}
