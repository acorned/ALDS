package recursive;

import java.util.Stack;

public class Task06 {

    Stack<Integer> tower1 = new Stack<>();
    Stack<Integer> tower2 = new Stack<>();
    Stack<Integer> tower3 = new Stack<>();

    public void towerOfHanoi(Stack source, Stack target, Stack temp, int n) {
        if (n > 0) {
            towerOfHanoi(source, temp, target, n - 1);
            target.push(source.pop());
            System.out.printf("%s %s %s\n", tower1, tower2, tower3);
            towerOfHanoi(temp, target, source, n - 1);
        }
    }

    public static void main(String[] args) {

        Task06 app = new Task06();
        int n = 5;
        for (int i = n; i > 0; i--) {
            app.tower1.push(i);
        }

        app.towerOfHanoi(app.tower1, app.tower2, app.tower3, n);
    }
}
