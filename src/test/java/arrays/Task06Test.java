package arrays;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class Task06Test {

    @Test
    public void compress() {
        String s = "aaaabbbbbbbbccccccccd";
        String s2 = "abcd";
        assertThat("a4b8c8d1", Is.is(Task06.compress(s)));
        assertThat("abcd", Is.is(Task06.compress(s2)));
    }

}