public class Edge {

        double weight; // weight of edge
        Vertex eVertex;

        public Edge(Vertex ev, double wt) {
                this.eVertex = ev;
                this.weight = wt;
        }


        @Override
        public String toString(){
                StringBuilder str = new StringBuilder();
                str.append(String.format("-- %.2f  -> %s  ", this.getWeight(),this.eVertex.getName()));

                return str.toString();
        }

        private double getWeight() {
                return this.weight;
        }

}
