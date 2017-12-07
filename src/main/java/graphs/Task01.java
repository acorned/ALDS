package graphs;

//Thisk task took several hours
public class Task01 {

    public static boolean ifConnected(DiGraph graph, String sourceName, String destinationName) {

        DiGraph.Node source = graph.getNodes()
                                   .stream()
                                   .filter(node -> node.name.equals(sourceName))
                                   .findFirst()
                                   .get();

        DiGraph.Node destination = graph.getNodes()
                                        .stream()
                                        .filter(node -> node.name.equals(destinationName))
                                        .findFirst()
                                        .get();

        return graph.ifConnected(source, destination);
    }

}
