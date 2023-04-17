import java.util.ArrayList;

public class Vertex {

        String vName;
        ArrayList<Edge> edges;

        public Vertex(String name) {
                this.vName = name;
                this.edges = new ArrayList<Edge>();
        }
}
