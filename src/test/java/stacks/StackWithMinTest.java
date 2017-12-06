package stacks;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class StackWithMinTest {
    @Test
    public void findMin() {
        StackWithMin<Integer> stack = new StackWithMin<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(0);
        stack.push(0);

        assertThat(stack.min(), Is.is(0));
        stack.pop();
        assertThat(stack.min(), Is.is(0));
        stack.pop();
        assertThat(stack.min(), Is.is(1));

    }

}