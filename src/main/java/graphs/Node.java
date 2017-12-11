package graphs;

public class Node {
        public String name;
        public Node[] nodes = new Node[2];
        Integer depth;

        public Node(String name) {
            this.name = name;
        }
}
