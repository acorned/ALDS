package linkedlists;

import java.util.LinkedList;
import java.util.Stack;

import static java.lang.Character.toLowerCase;

//It took 10 minutes.
public class Task06 {

    public static boolean isPalindrome(LinkedList<Character> l) {
        Stack<Character> stack = new Stack<>();
        for (Character c : l) stack.push(toLowerCase(c));
        for (Character c : l) if (toLowerCase(c) != stack.pop()) return false;
        return true;
    }
}
