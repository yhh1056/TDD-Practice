package method;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author {yhh1056}
 * Create by {2020/09/15}
 */
public class MethodTest {

    @Test
    void stringBuilderReverse() {
        String string = "abcd";
        StringBuilder sb = new StringBuilder(string);

        assertEquals("dcba", String.valueOf(sb.reverse()));
    }

    @Test
    void splitString() {
        String string = "abcdef";
        String hasSpecialCharacters = "ab:cd,ef";

        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f"}, string.split(""));
        assertArrayEquals(new String[]{"ab", "def"}, string.split("c"));

        assertArrayEquals(new String[]{}, string.split("abcdef"));
        assertEquals(0, string.split("abcdef").length);

        assertArrayEquals(new String[]{"ab", "cd", "ef"}, hasSpecialCharacters.split("[:,]"));
    }
}
