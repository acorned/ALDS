package linkedlists;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertThat;

public class Task05Test {
    @Test
    public void sum() {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(7);
        l1.add(1);
        l1.add(6);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2);
        l2.add(1);
        l2.add(9);
        l2.add(4);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(9);
        expected.add(2);
        expected.add(5);
        expected.add(5);

        assertThat(Task05.sum(l1, l2), Is.is(expected));
    }

}