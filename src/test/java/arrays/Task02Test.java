package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task02Test {
    @Test
    public void isTransposition() {
        String s1 = "asdfghjk";
        String s2 = "kjhgfdsa";
        assertTrue(Task02.isTransposition(s1, s2));
    }

    @Test
    public void isTranspositionWhenNull() {
        String s1 = null;
        String s2 = null;
        assertTrue(Task02.isTransposition(s1, s2));
    }
}