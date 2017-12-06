package stacks;

import java.util.EmptyStackException;

//This task took 20 minutes
public class StackWithMin<T extends Comparable> {

    private Node<T> top;
    private Node<T> min;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T result = top.data;

        if (min.equals(top)) min = min.next;

        top = top.next;
        return result;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;

        if (min == null) min = new Node<>(data);

        if (node.data.compareTo(min.data) < 0) {
        Node<T> temp = min;
        min = node;
        min.next = temp;
        }
    }

    public T min() {return min.data;}

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

}
