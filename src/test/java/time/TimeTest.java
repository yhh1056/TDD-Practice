package time;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author {yhh1056}
 * Create by {2020/10/29}
 */
public class TimeTest {


    @Test
    @DisplayName("시간 계산")
    void test() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date time1 = formatter.parse("01:33:55");
        Date time2 = formatter.parse("01:35:10");
        long different = time2.getTime() - time1.getTime();
        long result = different / 1000;

        assertEquals(75, result);
    }
}
