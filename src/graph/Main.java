package graph;

/**
 * @Description
 * @Author xbockx
 * @Date 1/23/2022
 */
public class Main {
    public static void main(String[] args) {
        ListGraph<String, Integer> graph = new ListGraph();
        graph.addEdge("V1", "V0", 9);
        graph.addEdge("V1", "V2", 3);
        graph.addEdge("V2", "V0", 2);
        graph.addEdge("V2", "V3", 5);
        graph.addEdge("V3", "V4", 1);
        graph.addEdge("V0", "V4", 6);

        graph.dfs("V1");
        System.out.println("=======");
        graph.dfsNonRecursion("V1");
    }
}
