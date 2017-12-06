package stacks;

import java.util.EmptyStackException;

//This task took 20 minutes
public class StackWithMin<T extends Comparable> {

    private Node<T> top;
    private T min;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T result = top.data;
        top = top.next;
        return result;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
        if (min == null || data.compareTo(min) < 0) min = data;
    }

    public T min() {return min;}

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

}
