package graphs;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task01Test {
    @Test
    public void test() {
        DiGraph graph = new DiGraph();
        graph.addNodes("1", "2", "3", "4", "5", "6", "7", "8");
        graph.addEdge("1", "2");
        graph.addEdge("1", "6");
        graph.addEdge("6", "3");
        graph.addEdge("2", "7");
        graph.addEdge("2", "8");
        graph.addEdge("5", "4");

        for (DiGraph.Node node : graph.getNodes()) {
            System.out.println(node);
        }

        assertTrue(Task01.ifConnected(graph, "1", "3"));
        assertFalse(Task01.ifConnected(graph, "1", "5"));
    }


}