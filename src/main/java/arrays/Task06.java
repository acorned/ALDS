package arrays;
//This task took about 15 minutes
public class Task06 {

    public static String compress(String s) {

        if (s == null) return null;

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            count++;
            if (s.charAt(i) != s.charAt(i + 1)) {
                result.append(s.charAt(i));
                result.append(count);
                count = 0;
            }
        }
        result.append(s.charAt(s.length() - 1));
        result.append(count + 1);

        return result.toString().length() > s.length() ? s : result.toString();
    }
}
