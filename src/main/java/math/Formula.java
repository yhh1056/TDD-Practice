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
     * 팩토리얼
     * int 사용시
     * 자연수 n은 n < 32
     */
    public int getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = n;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * 콤비네이션
     * n >= r
     * n C r == n C n-r
     */
    public int getCombination(int n, int r) {
        return getFactorial(n) / (getFactorial(n - r) * getFactorial(r));
    }

    /**
     * 파스칼 삼각형
     * n까지의 삼각형
     * 조합을 dp로 사용하여 풀 경우 사용
     */
    public int[][] getPascal(int number) {
        final int defaultNum = 1;

        int[][] pascal = new int[number][number];

        pascal[0][0] = 1;
        for (int n = 1; n < number; n++) {
            pascal[n][0] = defaultNum;
            for (int r = 1; r < n; r++) {
                pascal[n][r] = pascal[n - 1][r - 1] + pascal[n - 1][r];
            }
            pascal[n][n] = defaultNum;
        }
        return pascal;
    }
}
