package linkedlists;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.Assert.assertTrue;

public class Task04Test {

    @Test
    public void isSplitted() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(10);
        l.add(105);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(4);
        Integer value = 5;

        LinkedList<Integer> splittedList = Task04.splitByX(l, value);

        Iterator<Integer> i = splittedList.iterator();
        while (i.next() < value);

        while (i.hasNext()) {
            assertTrue(i.next() >= value);
        }
    }

}