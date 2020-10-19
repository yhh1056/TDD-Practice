package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * author {yhh1056}
 * Create by {2020/09/22}
 */
public class SortTest {

    @Test
    void compareTo() {
        String[] test = new String[]{"53", "54"};

        Arrays.sort(test, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));

        System.out.println(Arrays.toString(test));
    }

}
