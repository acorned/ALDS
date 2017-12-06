package stacks;

import java.util.Stack;

public class Task05 {
    public static <T extends Comparable> Stack<T> sortStack(Stack<T> stack) {
        if (stack == null || stack.empty()) return stack;

        Stack<T> tempStack = new Stack<>();
        tempStack.push(stack.pop());

        while (!stack.empty()) {
            T value = stack.pop();
            if (value.compareTo(tempStack.peek()) >= 0) tempStack.push(value);
            else {
                while (!tempStack.empty() && value.compareTo(tempStack.peek()) <= 0) {
                    stack.push(tempStack.pop());
                }
                tempStack.push(value);
            }

        }

        while (!tempStack.empty()) stack.push(tempStack.pop());

        return stack;
    }
}
