// File: TaskGraphEdges.java

public class Task011 {
    int vertex;

    // Inner class to represent an edge
    static class Edge {
        int start;
        int end;

        Edge(int start, int end) {
            this.start = start;
            this.end = end;
        }

        void printEdge() {
            System.out.println(start + " - " + end);
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        Edge[] edges = new Edge[8];

        edges[0] = new Edge(1, 2);
        edges[1] = new Edge(1, 3);
        edges[2] = new Edge(1, 4);
        edges[3] = new Edge(2, 4);
        edges[4] = new Edge(2, 5);
        edges[5] = new Edge(3, 4);
        edges[6] = new Edge(3, 5);
        edges[7] = new Edge(4, 5);

        System.out.println("Graph edges:");
        for (Edge e : edges) {
            e.printEdge();
        }

        System.out.println("Total number of vertices: " + vertex);
        System.out.println("Total number of edges: " + edges.length);
    }
}
