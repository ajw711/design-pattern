package strategy;

import strategy.after.KakaoPayStrategy;
import strategy.after.NaverPayStrategy;
import strategy.before.PaymentService;

public class Strategy {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        //before
        service.processPayment("KAKAO", 100);
        service.processPayment("NAVER", 100);


        //after
        strategy.after.PaymentService paymentStrategy = new strategy.after.PaymentService();
        // 1. 카카오페이 전략 선택
        paymentStrategy.setStrategy(new KakaoPayStrategy());
        paymentStrategy.process(10000);

        // 2. 네이버페이 전략으로 교체 (코드 수정 없이 객체만 교체)
        paymentStrategy.setStrategy(new NaverPayStrategy());
        paymentStrategy.process(20000);

        // 3. 익명 클래스나 람다로 즉석에서 전략 생성도 가능!
        paymentStrategy.setStrategy(amount -> System.out.println("현금 결제: " + amount));
        paymentStrategy.process(5000);
    }
}
