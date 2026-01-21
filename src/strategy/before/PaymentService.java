package strategy.before;

public class PaymentService {
    public void processPayment(String method, int amount) {
        if (method.equals("KAKAO")) {
            System.out.println("카카오페이로 " + amount + "원 결제합니다.");
        } else if (method.equals("NAVER")) {
            System.out.println("네이버페이로 " + amount + "원 결제합니다.");
        } else if (method.equals("CARD")) {
            System.out.println("신용카드로 " + amount + "원 결제합니다.");
        }
        // 새로운 결제 수단이 생길 때마다 이 코드를 계속 수정해야 함 (OCP 위반)
    }

}
