package math;

public class Formula {
    /**
     * 삼각수
     * <p>
     * 삼각형을 만들기 위해 사용된 물건의 총 갯수
     * 1, 3, 6, 10, 15 ..... 증가
     */
    public int getTrigonometric(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n * (n + 1)) / 2;
    }

    /**
     * int 사용시
     * 자연수 n은 0 < n < 32
     */
    public int getFactorial(int n) {
        int factorial = n;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        return factorial;
    }


}
