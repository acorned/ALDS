package testing;

public class Task01 {

    private StringBuilder fibs = new StringBuilder();

    public boolean isStringFib(String s, Long n1, Long n2) {

        Long temp = n1;
        n1 = n2;
        n2 += temp;
        if (fibs.toString().contains(s)) return true;
        if (n1 > Long.valueOf(s)) return false;
        fibs.append(String.valueOf(n1));
        return isStringFib(s, n1, n2);
    }

    public static void main(String[] args) {
        Task01 example = new Task01();
        System.out.println(example.isStringFib("13213455", 0L, 1L));
        System.out.println(example.isStringFib("99999999", 0L, 1L));
    }
}
