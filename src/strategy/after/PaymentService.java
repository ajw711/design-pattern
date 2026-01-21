package strategy.after;

public class PaymentService {
    private PaymentStrategy strategy; // 인터페이스에 의존

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(int amount) {
        strategy.pay(amount); // 구체적으로 누가 결제할지는 런타임에 결정됨
    }
}
