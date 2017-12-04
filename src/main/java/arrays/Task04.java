package arrays;

import java.util.Arrays;

// This task took 60 minutes.
public class Task04 {

    public static boolean isPalindromeTransposition(String s) {

        if (s == null) return false;

        char[] chars = s.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(chars);

        boolean hasUnique = false;
        for (int i = 0; i < chars.length - 1; i += 2) {
            if (chars[i] != chars[i + 1]) {
                if (hasUnique || i == chars.length - 2) return false;
                else {
                    hasUnique = true;
                    i--;
                }
            }

        }
        return true;
    }
}
