import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> vertices;

    public Graph() {
        this.vertices = new ArrayList<>();
    }

    // Add a vertex to a graph
    public void addVertex(String vertex) {

        // or if (!vertices.contains(vertex))
        if (vertex.compareTo(String.valueOf(vertices)) == 0) {
            Vertex toAdd = new Vertex(vertex);
            this.vertices.add(toAdd);
        }
    }

    public void addEdge(String startVer, String endVer, double wt) {

        // check if start vertex exists or not
        int startPos = this.getIndex();
        if (startPos < 0) {
            this.addVertex(startVer);
        }
        // check if end vertex exists or not
        int endPos = this.getIndex(endVer);
        if (endPos < 0) {
            this.addVertex(endVer);
        }
        Vertex start = this.vertices.get(startPos);
        boolean exists = false;
        for (int i = 0; i < start.edges.size(); i++) {
            if (start.edges.get(i).eVertex.vName == endVer) {
                    exists = true;
                    System.out.println("Edge already exists in Graph");
                    return;
                }
            }
            // Add same edge from end to start
            Edge edge =  new Edge(new Vertex(endVer), wt);
            start.edges.add(edge);
        // add vertex to startVertex arraylist of edges if edge with endVertex is not existing
        // add vertex to endVertex arraylist of edges if edge with startVertex is not existing
    }


    public int getIndex() {

    }
}
