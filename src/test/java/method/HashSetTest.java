package method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author {yhh1056}
 * Create by {2020/09/22}
 */
public class HashSetTest {

    @Test
    @DisplayName("addAll() 테스트 ")
    void allAll() {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> test = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        test.add(5);
        test.add(6);
        test.add(7);
        test.add(8);

        hashSet.addAll(test);
        test.clear();

        assertEquals(8, hashSet.size());
        assertEquals(0, test.size());
    }
}
