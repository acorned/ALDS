package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public static boolean isPalindromeTranspositionWithHashMap(String s) {
        if (s == null) return false;

        char[] chars = s.toLowerCase().replaceAll("\\s", "").toCharArray();
        Map<Character, Integer> mapOfChars = new HashMap<>();
        for (char c : chars) {
            if (mapOfChars.containsKey(c)) mapOfChars.put(c, mapOfChars.get(c) + 1);
            else mapOfChars.put(c, 1);
        }

        int unique = 0;
        for (Map.Entry<Character, Integer> entry : mapOfChars.entrySet()) {
            if (entry.getValue() % 2 != 0) unique++;
        }

        return unique <= 1;

    }
}
