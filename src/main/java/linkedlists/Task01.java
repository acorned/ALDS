package linkedlists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

//This task took several hours (I had to sleep with it)

public class Task01 {
    public static <T> LinkedList<T> deleteRepeats(LinkedList<T> l) {

        if (l == null) return null;

        Set<T> store = new HashSet<>();
        Iterator<T> i = l.iterator();

        while (i.hasNext()) {
            T value = i.next();
            if (store.contains(value)) i.remove();
            else store.add(value);
        }

        return l;
    }

    public static <T> LinkedList<T> deleteRepeatsWithoutDataStructures(LinkedList<T> l) {

        if (l == null) return null;

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
