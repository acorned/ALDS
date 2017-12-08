package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DiGraph {

    private ArrayList<Node> nodes = new ArrayList<>();

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void addNodes(String... names) {
        for (String name : names) {
            nodes.add(new Node(name));
        }
    }

    public void addEdge(String parentName, String childName) {
        Node parent = nodes.stream().filter(node -> node.name.equals(parentName)).findFirst().get();
        Node child = nodes.stream().filter(node -> node.name.equals(childName)).findFirst().get();
        parent.children.add(child);
    }

    public boolean ifConnected(Node source, Node destination) {
        if (source == null || destination == null || source.children.isEmpty()) return false;

        Map<Node, Boolean> isVisited = new HashMap<>();
        for (Node node : nodes) {
            isVisited.put(node, false);
        }
        return search(source, destination, isVisited);
    }

    private static boolean search(Node source, Node destination, Map<Node, Boolean> isVisited) {
        isVisited.replace(source, true);
        if (source.children.contains(destination)) return true;
        Boolean result = false;
        for (Node child : source.children) {
            if (result) return true;
            if (!isVisited.get(child)) result |= search(child, destination, isVisited);
        }
        return result;
    }

    public class Node {
        public String name;
        private ArrayList<Node> children = new ArrayList<>();


        private Node(String name) {
            this.name = name;
        }

        public ArrayList<Node> getChildren() {
            return children;
        }
    }
}
