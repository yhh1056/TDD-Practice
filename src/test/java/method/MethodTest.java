package method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author {yhh1056}
 * Create by {2020/09/15}
 */
public class MethodTest {

    @Test
    void StringBuilderReverse() {
        String string = "abcd";
        StringBuilder sb = new StringBuilder(string);

        assertEquals("dcba", String.valueOf(sb.reverse()));
    }
}
