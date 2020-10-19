package string;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author {yhh1056}
 * Create by {2020/10/19}
 */
public class StringTest {


    @Test
    void 돈_단위_쉼표_생성() {
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        String result = decimalFormat.format(134000);

        assertEquals("134,000", result);
    }
}
