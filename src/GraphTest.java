import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @org.junit.jupiter.api.Test
    void addVertex() {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        System.out.println(graph);
    }

    @org.junit.jupiter.api.Test
    void addEdge() {

        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", 5);
        graph.addEdge("C", "D", 7);

        // Assert that the edge was not added again and the weight was updated
        assertEquals(1, graph.vertices.get(0).edges.size());
        assertEquals(1, graph.vertices.get(1).edges.size());
        assertEquals(1, graph.vertices.get(2).edges.size());
        assertEquals(1, graph.vertices.get(3).edges.size());

        assertEquals("B", graph.vertices.get(0).edges.get(0).eVertex.vName);
        assertEquals("A", graph.vertices.get(1).edges.get(0).eVertex.vName);
        assertEquals(5, graph.vertices.get(0).edges.get(0).weight);
        assertEquals(5, graph.vertices.get(1).edges.get(0).weight);

        // Assert that the edge "C" -> "D" was added correctly
        assertEquals("D", graph.vertices.get(2).edges.get(0).eVertex.vName);
        assertEquals("C", graph.vertices.get(3).edges.get(0).eVertex.vName);
        assertEquals(7, graph.vertices.get(3).edges.get(0).weight);
        assertEquals(7, graph.vertices.get(2).edges.get(0).weight);

        // Assert that the edge "A" -> "C" was updated with weight 15
        graph.addEdge("A", "C", 15);
        assertEquals("C", graph.vertices.get(0).edges.get(1).eVertex.vName);
        assertEquals(15, graph.vertices.get(0).edges.get(1).weight);

        System.out.println(graph.toString());
    }

}