package recursive;

import java.util.HashSet;

public class Task04 {

    HashSet<HashSet<Integer>> subsetsCash = new HashSet<>();

    public HashSet<HashSet<Integer>> allSubsets(HashSet<Integer> set) {
        if (set.isEmpty() || subsetsCash.contains(set)) return new HashSet<>();

        subsetsCash.add(set);
        for (Integer number : set) {
            HashSet<Integer> temp = new HashSet<>();
            temp.addAll(set);
            temp.remove(number);
            subsetsCash.addAll(allSubsets(temp));
        }
        return subsetsCash;
    }

    public static void main(String[] args) {
        Task04 t = new Task04();
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(t.allSubsets(set));
    }
}
