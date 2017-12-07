package recursive;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Task02Test {

    @Test
    public void testMatrix() {
        Task02 example = new Task02();

        example.m = new int[][]{{2, 0, 0, 1, 0, 0, 0}, {0, 1, 0, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0, 0}};
        assertTrue(example.findWay(example.m.length, example.m[0].length));
        System.out.println(Arrays.deepToString(example.m));
    }


}