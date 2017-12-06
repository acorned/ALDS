package stacks;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertTrue;

public class Task05Test {

    @Test
    public void sortStack() throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        Task05.sortStack(stack);

        while (!stack.empty()) {
            Integer value = stack.pop();
            assertTrue(stack.empty() || value <= stack.peek());
        }
    }

}