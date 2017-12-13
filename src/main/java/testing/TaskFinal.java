package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TaskFinal {
    HashMap<String, Node> nodes = new HashMap<>();

    public HashMap<String, Node> getNodes() {
        return nodes;
    }

    public void deleteNode(String name){

        Node node = nodes.get(name);

        if (node.links.size() != 2) {
            System.out.format("Can't delete node %s\n", name);
            return;
        }

        Node first = node.links.first();
        Node second = node.links.last();
        first.links.add(second);
        first.links.remove(node);
        second.links.add(first);
        second.links.remove(node);

        nodes.remove(name);
    }

    public void optimize(){
        HashMap<String, Integer> mapHelper = new HashMap<>();

        for (Node node: nodes.values()) {
            mapHelper.put(node.name, node.links.size());
        }

        for (Map.Entry<String, Integer> item : mapHelper.entrySet()) {
            if (item.getValue() == 2) deleteNode(item.getKey());
        }

    }

    class Node implements Comparable<Node> {

        String name;
        TreeSet<Node> links = new TreeSet<Node>();

        public Node(String name){
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
        for (Node node: graph.getNodes().values()){
            System.out.format("%s : %s\n", node.name, node.getLinks());
        }

        graph.optimize();
        System.out.println("After optimizing:");
        for (Node node: graph.getNodes().values()){
            System.out.format("%s : %s\n", node.name, node.getLinks());
        }

        graph.deleteNode("4");
    }
}
