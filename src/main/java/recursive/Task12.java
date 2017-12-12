package recursive;

import java.util.ArrayList;

public class Task12 {
    private static ArrayList<ArrayList<Integer>> results = new ArrayList<>();

    public static void findQueen(ArrayList<Integer> queens, int row) {
        if (row == 8) {
            results.add((ArrayList<Integer>) queens.clone());
        }
        else {
            for (int i = 0; i < 8; i++) {
                queens.set(row, i);
                if (isCorrect(queens, row)) findQueen(queens, row + 1);
            }
        }
    }

    public static boolean isCorrect(ArrayList<Integer> queens, int row) {
        for (int i = 0; i < row; i++) {
            if (queens.get(row) == queens.get(i) ||
                    queens.get(row) - queens.get(i) == row - i ||
                    queens.get(row) - queens.get(i) == i - row) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> queens = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            queens.add(0);
        }

        findQueen(queens, 0);

        System.out.println(results.size());
    }
}
