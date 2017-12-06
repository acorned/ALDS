package linkedlists;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task06Test {
    @Test
    public void isPalindrome() {
        LinkedList<Character> string = new LinkedList<>();
        string.add('D');
        string.add('o');
        string.add('m');
        string.add('m');
        string.add('o');
        string.add('d');
        assertTrue(Task06.isPalindrome(string));

        string.add('s');
        assertFalse(Task06.isPalindrome(string));
    }

}