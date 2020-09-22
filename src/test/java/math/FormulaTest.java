package math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author {yhh1056}
 * Create by {2020/09/15}
 */
class FormulaTest {
    Formula formula = new Formula();

    @Test
    @DisplayName("삼각수")
    void trigonometric() {
        assertEquals(1, formula.getTrigonometric(1));
        assertEquals(3, formula.getTrigonometric(2));
        assertEquals(6, formula.getTrigonometric(3));
        assertEquals(10, formula.getTrigonometric(4));
        assertEquals(15, formula.getTrigonometric(5));

    }

    @Test
    @DisplayName("팩토리얼")
    void factorial() {
        assertEquals(1, formula.getFactorial(0));
        assertEquals(1, formula.getFactorial(1));
        assertEquals(2, formula.getFactorial(2));
        assertEquals(6, formula.getFactorial(3));
        assertEquals(24, formula.getFactorial(4));
        assertEquals(120, formula.getFactorial(5));
        assertEquals(738197504, formula.getFactorial(31));
    }

    @Test
    @DisplayName("콤비네이션")
    void combination() {
        assertEquals(1, formula.getCombination(0, 0));
        assertEquals(1, formula.getCombination(3, 3));
        assertEquals(15, formula.getCombination(6, 2));
        assertEquals(15, formula.getCombination(6, 4));
    }

    @Test
    @DisplayName("파스칼")
    void pascal() {
        int[][] pascal = formula.getPascal(5);
        assertEquals(1, pascal[0][0]);
        assertEquals(6, pascal[4][2]);
        assertEquals(pascal[3][3], pascal[2][2] + pascal[2][3]);
    }


    @Test
    void MathSqrt() {
        assertEquals(2.0, Math.sqrt(4));
        assertEquals(1.4142135623730951, Math.sqrt(2));
    }

    @Test
    void MathPow() {
        assertEquals(16.0, Math.pow(4, 2));
        assertEquals(27, Math.pow(3, 3));
        assertEquals(1.0, Math.pow(3, 0));
    }

    @Test
    void MathFloor() {
        assertEquals(4.0, Math.floor(4.213213));
        assertEquals(3.0, Math.floor(3.1111));
        assertEquals(3.0, Math.floor(3.9999));
    }
}