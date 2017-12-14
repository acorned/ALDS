package testing;

import java.util.*;

public class TaskFinal {
    HashMap<String, Node> nodes = new HashMap<>();

    public HashMap<String, Node> getNodes() {
        return nodes;
    }

    public boolean deleteNode(String name) {

        Node node = nodes.get(name);

        if (node == null) {
            System.out.format("Node %s is already deleted\n", name);
            return false;
        }

        if (node.links.size() != 2) {
            System.out.format("State of node %s has changed, now it can't be deleted\n", name);
            return false;
        }

        Node first = node.links.first();
        Node second = node.links.last();
        first.links.add(second);
        first.links.remove(node);
        second.links.add(first);
        second.links.remove(node);

        nodes.remove(name);
        System.out.format("Node %s has deleted\n", name);
        return true;
    }

    public void optimize() {
        Queue<Map.Entry<String, Integer>> queueHelper = new LinkedList<>();

        for (Node node : nodes.values()) {
            queueHelper.add(new AbstractMap.SimpleEntry<>(node.name, node.links.size()));
        }

        while (!queueHelper.isEmpty()) {
            Map.Entry<String, Integer> item = queueHelper.remove();
            if (item.getValue() == 2 && nodes.get(item.getKey()) != null) {
                Node first = nodes.get(item.getKey()).links.first();
                Node second = nodes.get(item.getKey()).links.last();
                if (deleteNode(item.getKey())) {
                    if (first.links.size() == 2) queueHelper.add(new AbstractMap.SimpleEntry<>(first.name, 2));
                    if (second.links.size() == 2) queueHelper.add(new AbstractMap.SimpleEntry<>(second.name, 2));
                }
            }

        }
    }


    class Node implements Comparable<Node> {

        String name;
        TreeSet<Node> links = new TreeSet<Node>();

        public Node(String name) {
            this.name = name;
            nodes.put(name, this);
        }

        public void addEdge(String name) {
            Node link = nodes.get(name);
            links.add(link);
            link.links.add(this);
        }

        public ArrayList<String> getLinks() {
            ArrayList<String> links = new ArrayList<>();
            for (Node n : this.links) {
                links.add(n.name);
            }
            return links;
        }

        @Override
        public int compareTo(Node o) {
            return name.compareTo(o.name);
        }

    }

    public static void main(String[] args) {
        TaskFinal graph = new TaskFinal();
        graph.new Node("0");
        graph.new Node("1");
        graph.new Node("2");
        graph.new Node("3");
        graph.new Node("4");
        graph.new Node("5");
        graph.new Node("6");
        graph.new Node("7");
        graph.getNodes().get("0").addEdge("1");
        graph.getNodes().get("1").addEdge("3");
        graph.getNodes().get("3").addEdge("6");
        graph.getNodes().get("6").addEdge("4");
        graph.getNodes().get("6").addEdge("7");
        graph.getNodes().get("7").addEdge("5");
        graph.getNodes().get("5").addEdge("4");
        graph.getNodes().get("2").addEdge("4");
        graph.getNodes().get("2").addEdge("5");
        System.out.println("At start we have these edges:");
        for (Node node : graph.getNodes().values()) {
            System.out.format("%s : %s\n", node.name, node.getLinks());
        }

        graph.optimize();
        System.out.println("After optimizing:");
        for (Node node : graph.getNodes().values()) {
            System.out.format("%s : %s\n", node.name, node.getLinks());
        }

        graph.deleteNode("4");
    }
}
