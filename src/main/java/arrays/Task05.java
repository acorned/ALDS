package arrays;

//This task took 30 minutes
public class Task05 {
    public static boolean isModificatedOnce(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        int lengthDifference = s1.length() - s2.length();

        if (Math.abs(lengthDifference) > 1) return false;

        int modificationCount = 0;
        int bias = 0;


        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i - bias)) {
                modificationCount++;
                bias = lengthDifference;
            }

        }

        return modificationCount <= 1;
    }
}
