package recursive;

import java.util.HashSet;
import java.util.Set;

public class Task09 {
    public static Set<String> generateBraces(int n) {
        Set<String> result = new HashSet<>();
        if (n == 1) {
            result.add("()");
            return result;
        }
        for (String str : generateBraces(n - 1)) {
            result.add("()" + str);
            result.add(str + "()");
            result.add("(" + str + ")");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateBraces(4));
    }
}
