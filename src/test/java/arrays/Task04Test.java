package arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task04Test {

    @Test
    public void isPalindrome() {
        String s = "palind rome Plindr omea s";
        String s2 = "palind rome Plindr omea st";
        assertTrue(Task04.isPalindromeTransposition(s));
        assertFalse(Task04.isPalindromeTransposition(s2));
    }

}