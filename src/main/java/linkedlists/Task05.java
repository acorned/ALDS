package linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class Task05 {
    public static LinkedList<Integer> sum(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        Iterator<Integer> i1 = l1.iterator();
        Iterator<Integer> i2 = l2.iterator();
        Integer toAdd = 0;

        while (i1.hasNext()) {
            Integer sum = (i2.hasNext()) ? i1.next() + i2.next() + toAdd : i1.next() + toAdd;
            toAdd = (sum > 10) ? 1 : 0;
            result.add(sum % 10);
        }

        while (i2.hasNext()) {
            result.add(i2.next() + toAdd);
            toAdd = 0;
        }

        return result;
    }
}
