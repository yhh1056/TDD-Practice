package string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author {yhh1056}
 * Create by {2020/10/19}
 */
public class StringTest {

    @Test
    @DisplayName("charAt")
    void charAt() {
        String test = "AAABBBCCCDDD";
        assertAll(
                () -> assertEquals('A', test.charAt(0)),
                () -> assertEquals('B', test.charAt(3)),
                () -> assertEquals('D', test.charAt(test.length() - 1))
        );
    }

    @Test
    @DisplayName("copyValueOf")
    void copyValueOf() {
        char[] charArray = {'s', 't', 'u', 'd', 'y', ' ', 'S', 'T', 'R', 'I', 'N', 'G'};

        assertEquals("study", String.copyValueOf(charArray, 0,5));
        assertEquals("STRING", String.copyValueOf(charArray, 6,6));
    }

    @Test
    @DisplayName("substring")
    void substring() {
        String test = "STUDY JAVA";

        assertEquals("JAVA", test.substring(test.lastIndexOf("J")));
    }

    @Test
    @DisplayName("startWith")
    void startWith() {
        String test = "자바 알고리즘 스터디";

        assertTrue(test.startsWith("자바 알고"));
    }

    @Test
    @DisplayName("endWith")
    void endWith() {
        String test = "자바 알고리즘 스터디";

        assertTrue(test.endsWith("리즘 스터디"));
    }

    @Test
    @DisplayName("indexOf")
    void indexOf() {
        String test = "자바 알고리즘 스터디";

        assertEquals(3, test.indexOf('알'));
    }

    @Test
    @DisplayName("lastIndexOf")
    void lastIndexOf() {
        String test = "자바 알고리즘 스터디";

        assertEquals(3, test.indexOf('알'));
    }

    @Test
    @DisplayName("toUpperCase")
    void toUpperCase() {
        String test = "java";

        assertEquals("JAVA", test.toUpperCase());
    }

    @Test
    @DisplayName("toLowerCase")
    void toLowerCase() {
        String test = "JAVA";

        assertEquals("java", test.toLowerCase());
    }

    @Test
    @DisplayName("replaceFirst")
    void replaceFirst() {
        String test = "JAVA";

        assertEquals("java!!!", test.replaceFirst("JAVA", "java!!!"));
    }

    @Test
    @DisplayName("regionMatches")
    void regionMatches() {
        String test = "JAVA Spring Jpa";
        String test2 = "java Spring JPA";

        assertTrue(test.regionMatches(5, test2, 5, 5));
    }

    @Test
    void 돈_단위_쉼표_생성() {
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        String result = decimalFormat.format(1340002);

        assertEquals("1,340,002", result);
    }
}
