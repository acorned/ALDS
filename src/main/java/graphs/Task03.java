package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Task03 {
    HashMap<Integer, LinkedList<String>> depths = new HashMap<>();

    void fillDepths(Node root) {
        Queue<Node> queue = new LinkedList<>();
        root.depth = 1;
        queue.add(root);

        while (!queue.isEmpty()) {

            Node r = queue.remove();
            depths.putIfAbsent(r.depth, new LinkedList<>());
            depths.get(r.depth).add(r.name);

            for (Node n : r.nodes) {
                if (n != null && n.depth == null) {
                    n.depth = r.depth + 1;
                    queue.add(n);
                }
            }

        }
    }

    public static void main(String[] args) {
        Task03 someTree = new Task03();

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

        someTree.fillDepths(root);
        for (Map.Entry<Integer, LinkedList<String>> list : someTree.depths.entrySet()) {
            System.out.format("%d %s\n", list.getKey(), list.getValue());
        }


    }
}
