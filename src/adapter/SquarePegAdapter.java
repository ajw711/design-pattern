package adapter;

/*
클래스 상속은 기존에 만들어진 기능과 상태를 물려받아 재사용하고 싶을 때 사용합니다.
인터페이스는 객체가 어떤 동작(규격)을 해야 하는지 정의하고 싶을 때 사용합니다.
 */
public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result;
    }
}
