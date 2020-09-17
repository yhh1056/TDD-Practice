package method;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

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

    @Test
    void toCharArray() {
        String string = "hello";
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};

        assertArrayEquals(chars, string.toCharArray());
    }

    @Test
    void intToString() {
        int[] ints = new int[]{1, 2, 3, 4, 5};
        String string = "[1, 2, 3, 4, 5]";

        assertEquals(string, Arrays.toString(ints));
    }

    @Test
    void arrayFill() {
        int[] ints = new int[5];
        Arrays.fill(ints, 3);

        assertArrayEquals(new int[]{3, 3, 3, 3, 3}, ints);
    }

    @Test
    void findMaxValueIndex() {
        //given
        int[] arr = new int[]{1, 6, 2, 7, 8};
        //when
        int[] sortedIndices = IntStream.range(0, arr.length)
                .boxed().sorted(Comparator.comparingInt(i -> arr[i]))
                .mapToInt(ele -> ele).toArray();
        //then
        assertArrayEquals(new int[]{0, 2, 1, 3, 4}, sortedIndices);
    }

    @Test
    void CollectionMin() {
        //given
        List<Integer> arrays = new ArrayList<>();
        arrays.add(6);
        arrays.add(4);
        arrays.add(0);
        arrays.add(1);
        arrays.add(2);
        arrays.add(-1);
        //when
        Integer min = Collections.min(arrays);
        //then

        assertEquals(-1, min);
    }

    @Test
    void CollectionMax() {
        //given
        List<Integer> arrays = new ArrayList<>();
        arrays.add(6);
        arrays.add(4);
        arrays.add(0);
        arrays.add(1);
        arrays.add(2);
        arrays.add(-1);
        //when
        Integer min = Collections.max(arrays);
        //then

        assertEquals(6, min);
    }

    @Test
    void listRemoveToInteger() {
        //given
        List<Integer> arrays = new ArrayList<>();
        arrays.add(6);
        arrays.add(4);
        arrays.add(0);
        arrays.add(1);
        arrays.add(2);
        arrays.add(-1);
        //when
        arrays.remove((Integer) 4);
        //then

        assertEquals(5, arrays.size());
        assertEquals(0, arrays.get(1));
    }
}