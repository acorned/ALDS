package testing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task02 {

    public static TreeSet<Long> allPossible = new TreeSet<>();

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) allPossible.add(Long.valueOf(prefix));
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    public static void main(String[] args) {
        permutation("", "123456789");
        System.out.println(allPossible.size());

        HashMap<Long, Set<Long>> result = new HashMap<>();
        Long count = 0L;

        for (Long divisioner : allPossible) {
            for (int i = 2; i <= 987_654_321 / divisioner; i++) {

                Set<Character> name = new HashSet<>();
                char[] s = String.valueOf((divisioner * i)).toCharArray();
                for(char c : s) {

                    name.add(c);
                }

                if (name.size()== 9) {
                    result.putIfAbsent(divisioner * i, new HashSet<Long>());
                    result.get(divisioner * i).add(divisioner);
                    count++;
                    System.out.printf("%d %d \n", divisioner * i, divisioner);
                }

            }

        }

        System.out.format("Total numbers %d\nTotal divisoners %d\nTotal results %d\n", allPossible.size(), result.size(), count);
    }


}
