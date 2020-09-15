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
        assertEquals(1, formula.getFactorial());
    }
}