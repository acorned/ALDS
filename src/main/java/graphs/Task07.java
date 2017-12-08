package graphs;

import java.util.HashMap;
import java.util.Map;

// Let's use our DiGraph. If projectA can't be done without ProjectB, projectA is a child of projectB.
public class Task07 {

    public static void main(String[] args) {
        DiGraph projects = new DiGraph();
        projects.addNodes("a", "b", "c", "d", "e", "f");
        projects.addEdge("a", "d");
        projects.addEdge("b", "d");
        projects.addEdge("f", "b");
        projects.addEdge("d", "f");
        projects.addEdge("f", "a");
        projects.addEdge("d", "c");

        HashMap<DiGraph.Node, Integer> numOfParents = new HashMap<>();

        for (DiGraph.Node node : projects.getNodes()) {
            numOfParents.put(node, 0);
        }

        for (DiGraph.Node node : projects.getNodes()) {
            for (DiGraph.Node child : node.getChildren()) {
                numOfParents.put(child, numOfParents.get(child) + 1);
            }
        }

        while (numOfParents.size() > 0) {
            boolean find = false;
            for (Map.Entry<DiGraph.Node, Integer> set : numOfParents.entrySet()) {

                if (set.getValue() == 0) {
                    find = true;
                    System.out.format("%s -> ", set.getKey().name);
                    for (DiGraph.Node child : set.getKey().getChildren()) {
                        numOfParents.put(child, numOfParents.get(child) - 1);
                    }
                    numOfParents.remove(set.getKey());
                    break;
                }
            }
            if (find == false) {
                System.out.println("Rest of projects can't be done");
                break;
            }
        }
    }

}
