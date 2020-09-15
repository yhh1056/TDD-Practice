package math;

public class Formula {
    /**
     * 삼각수
     *
     * 삼각형을 만들기 위해 사용된 물건의 총 갯수
     * 1, 3, 6, 10, 15 ..... 증가
     */
    public int getTrigonometric(int n) {
        return (n * (n + 1)) / 2;
    }



}
