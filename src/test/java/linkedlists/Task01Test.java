package linkedlists;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertThat;

public class Task01Test {
    @Test
    public void deleteRepeats() {

        LinkedList<Integer> l = new LinkedList<>();
        l.add(2);
        l.add(1);
        l.add(1);
        l.add(4);
        l.add(2);
        l.add(7);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2);
        l2.add(1);
        l2.add(1);
        l2.add(4);
        l2.add(2);
        l2.add(7);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(2);
        expected.add(1);
        expected.add(4);
        expected.add(7);

        assertThat(Task01.deleteRepeats(l), Is.is(expected));
        assertThat(Task01.deleteRepeatsWithoutDataStructures(l2), Is.is(expected));
    }

}