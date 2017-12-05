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
//
//        boolean isChanged = false;
//
//        for (int j = 0; j < l.size(); j++) {
//            Iterator<T> i = l.iterator();
//            T value = i.next();
//            i.forEachRemaining(v -> {
//                if (v == value && i.hasNext()) {
//                    i.next();
//                    i.remove();
//                }
//            });
//        }
// TODO: 05.12.17 Do something 
        return l;
    }
}
