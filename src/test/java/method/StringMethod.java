package method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author {yhh1056}
 * Create by {2020/09/18}
 */
public class StringMethod {

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

    @Test
    @DisplayName("trim()_메소드_테스트")
    void trim() {
        String string = " 안녕하세요 ";
        String expect = "안녕하세요";

        assertEquals(expect, string.trim());
    }

    @Test
    @DisplayName("replace()_메소드_테스트")
    void replace() {
        String string = "해리야 안녕하세요";
        String expect = "해리님 안녕하세요";
        String expect2 = "해리야 안녕";

        assertEquals(expect, string.replace("야", "님"));
        assertEquals(expect2, string.replace("안녕하세요", "안녕"));
    }

    @Test
    @DisplayName("replaceAll()_메소드_테스트")
    void replaceAll() {
        String string = "테스트야 안녕하세요";
        String stringIncludeEnglish = "dieijf 안녕하세요";

        String expect = "해리님 안녕하세요";
        assertEquals(expect, string.replaceAll("테스트야", "해리님"));
        assertEquals(expect, stringIncludeEnglish.replaceAll("[a-zA-Z].*[a-zA-Z]", "해리님"));
    }

    @Test
    @DisplayName("replaceFirst()_메소드_테스트")
    void replaceFirst() {
        String string = "해리^ 안녕하세요^^";

        String expect = "해리님 안녕하세요^^";

        assertEquals(expect, string.replaceFirst("\\^", "님"));
    }

    @Test
    @DisplayName("join()_메소드_테스트")
    void join() {
        String[] names = new String[]{"해리", "호호", "yhh"};
        String join = String.join(", ", names);

        assertEquals("해리, 호호, yhh", join);
    }
}
