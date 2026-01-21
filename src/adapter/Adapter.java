package adapter;

public class Adapter {

    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("반지름 5인 원형 못이 반지름 5인 원형 구멍에 맞습니다.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("너비 2인 사각형 못이 반지름 5인 원형 구멍에 들어갑니다.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("너비 20인 사각형 못은 반지름 5인 원형 구멍에 들어가지 않습니다.");
        }
    }
}
