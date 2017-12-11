package graphs;

import java.util.ArrayList;
import java.util.Collections;

public class Task10 {
    public static ArrayList<String> inOrder(Node root) {
        ArrayList<String> result = new ArrayList<>();
        if (root != null) {
            result.addAll(inOrder(root.nodes[0]));
            result.add(root.name);
            result.addAll(inOrder(root.nodes[1]));
        }
        return result;
    }

    public static ArrayList<String> preOrder(Node root) {
        ArrayList<String> result = new ArrayList<>();
        if (root != null) {
            result.add(root.name);
            result.addAll(preOrder(root.nodes[0]));
            result.addAll(preOrder(root.nodes[1]));
        }
        return result;
    }

    public static boolean isPartOf(Node biggerTree, Node smallerTree) {
        return Collections.indexOfSubList(preOrder(biggerTree), preOrder(smallerTree)) != -1
                && Collections.indexOfSubList(inOrder(biggerTree), inOrder(smallerTree)) != -1;
    }

    public static void main(String[] args) {
        //First tree
        Node root = new Node("root");
        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        Node node3 = new Node("node3");
        Node node4 = new Node("node4");
        Node node5 = new Node("node5");
        Node node6 = new Node("node6");
        Node node7 = new Node("node7");
        Node node8 = new Node("node8");

        root.nodes[0] = node1;
        root.nodes[1] = node2;
        node1.nodes[0] = node3;
        node1.nodes[1] = node4;
        node2.nodes[0] = node5;
        node2.nodes[1] = node6;
        node3.nodes[0] = node7;
        node3.nodes[1] = node8;
        //Second tree
        Node root2 = new Node("node1");
        root2.nodes[0] = new Node("node3");
        root2.nodes[1] = new Node("node4");
        root2.nodes[0].nodes[0] = new Node("node7");
        root2.nodes[0].nodes[1] = new Node("node8");

        System.out.println(isPartOf(root, root2));
    }
}
