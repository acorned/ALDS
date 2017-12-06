package linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

/* This task took about 10 minutes.
*  I used LinkedList, which is doubly linked. But we can rewrite it with two stacks and save O(n) complexity.
* */

public class Task04 {
    public static <T extends Comparable> LinkedList<T> splitByX (LinkedList<T> l, T x) {

        LinkedList<T> splittedList = new LinkedList<>();

        Iterator<T> i = l.iterator();

        while (i.hasNext()) {
            T value = i.next();
            if (value.compareTo(x) < 0) splittedList.addFirst(value);
            else splittedList.addLast(value);
        }

        return splittedList;
    }
}
