package linkedlists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Task01 {
    public static <T> LinkedList<T> deleteRepeats(LinkedList<T> l) {

        Set<T> store = new TreeSet<>();
        Iterator<T> i = l.iterator();

        while (i.hasNext()) {
            T value = i.next();
            if (store.contains(value)) i.remove();
            else store.add(value);
        }

        return l;
    }

    public static <T> LinkedList<T> deleteRepeatsWithoutDataStructures(LinkedList<T> l) {
        Iterator<T> i = l.iterator();
        while (i.hasNext()) {

            T value = i.next();

            Iterator<T> j = l.iterator();
            while (j.next() != value);

            while (j.hasNext()) {
                if (j.next() == value) {
                    j.remove();
                    i = l.iterator();
                }
            }
        }

        return l;
    }
}
