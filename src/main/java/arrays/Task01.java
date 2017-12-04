package arrays;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

    public static boolean hasNoRepeats(String s) {
        if (s == null || s.length() == 0) return true;
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (chars.contains(c)) return false;
            else chars.add(c);
        }
        return true;
    }

    public static boolean hasNoRepeatsWithoutDataStructures(String s) {
        if (s == null || s.length() == 0) return true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }
}
