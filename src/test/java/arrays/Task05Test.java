package arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task05Test {
    @Test
    public void isModificatedOnce() {
        String s1 = "cake";
        String s2 = "bake";
        assertTrue(Task05.isModificatedOnce(s1, s2));

        s1 = "shuffle";
        s2 = "shmuffle";
        assertTrue(Task05.isModificatedOnce(s1, s2));

        s1 = "chubby";
        s2 = "chaby";
        assertFalse(Task05.isModificatedOnce(s1, s2));

    }

}