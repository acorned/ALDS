package linkedlists;

import org.junit.Test;

import java.util.LinkedList;

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
        System.out.println(Task04.splitByX(l, 5));
    }

}