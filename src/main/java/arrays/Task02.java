package arrays;

import java.util.Arrays;

//This task took 10 minutes.
public class Task02 {

    public static boolean isTransposition(String s1, String s2) {

        if (s1 == null && s2 == null) return true;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
