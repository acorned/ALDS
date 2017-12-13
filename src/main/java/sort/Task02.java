package sort;

//Let's use insertion sort with our own comparable function
public class Task02 {
    public static void anagramSort(String[] strings) {
        String[] helper = new String[strings.length];
        anagramSort(strings, helper, 0, strings.length - 1);
    }

    private static void anagramSort(String[] strings, String[] helper, int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            anagramSort(strings, helper, begin, middle);
            anagramSort(strings, helper, middle + 1, end);
            merge(strings, helper, begin, middle, end);
        }
    }

    private static void merge(String[] strings, String[] helper, int begin, int middle, int end) {
        for (int i = begin; i <= end; i++) {
            helper[i] = strings[i];
        }

        int helperLeft = begin;
        int helperRight = middle + 1;
        int current = begin;

        while (helperLeft <= middle && helperRight <= end) {
            if (hash(helper[helperLeft]).compareTo(hash(helper[helperRight])) <= 0) {
                strings[current] = helper[helperLeft];
                helperLeft++;
            } else {
                strings[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            strings[current + i] = helper[helperLeft + i];
        }
    }

    private static Long hash(String string) {
        Long result = 0L;
        for (char c : string.toCharArray()) {
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"anagram", "asd", "daf", "das", "granmama", "afsdiu", "bbbbbb", "aaaaaa", "diufas"};
        anagramSort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
