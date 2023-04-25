import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> vertices;

    public Graph() {
        this.vertices = new ArrayList<>();
    }

    public int getIndex(String vertex) {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).vName == vertex)
                return i;
        }
        return -1;
    }

    // Add a vertex to a graph
    public Vertex addVertex(String vertex) {
        Vertex toAdd = new Vertex(vertex);
        // or if (!vertices.contains(vertex))
        // vertex.compareTo(String.valueOf(vertices)) == 0
        if (getIndex(vertex) == -1) {
            this.vertices.add(toAdd);
        }
        else {
            System.out.println("Vertex" + vertex + " already exists.");
        }
        return toAdd;
    }

    public void addEdge(String startVer, String endVer, double wt) {
        Vertex start;
        Vertex end;
        // check if start vertex exists or not
        int startPos = this.getIndex(startVer);
        if (startPos < 0) {
            start = this.addVertex(startVer);
        }
        else {
            start = this.vertices.get(startPos);
        }
        // check if end vertex exists or not
        int endPos = this.getIndex(endVer);
        if (endPos < 0) {
            end = this.addVertex(endVer);
        }
        else {
            end = this.vertices.get(endPos);
        }

        for (int i = 0; i < start.edges.size(); i++) {
            if (start.edges.get(i).eVertex.vName == endVer) {
                    System.out.println("End Edge already exists in Graph");
                    return;
                }
            }

        for (int i = 0; i < start.edges.size(); i++) {
            if (end.edges.get(i).eVertex.vName.equals(startVer)) {
                System.out.println("Start Edge already exists in Graph");
                return;
            }
    }

            // Add same edge from end to start
            start.edges.add(new Edge(end, wt));
            end.edges.add(new Edge(start, wt));
        // add vertex to startVertex arraylist of edges if edge with endVertex is not existing
        // add vertex to endVertex arraylist of edges if edge with startVertex is not existing

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vertex vertex : vertices) {
            sb.append(vertex.vName).append(": ");
            for (Edge edge : vertex.edges) {
                sb.append(edge.eVertex.vName).append(" (").append(edge.weight).append("), ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
