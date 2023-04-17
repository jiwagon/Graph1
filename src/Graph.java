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
}
