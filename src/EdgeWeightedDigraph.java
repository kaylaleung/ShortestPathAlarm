
import java.util.ArrayList;

public class EdgeWeightedDigraph {

    private final int V;                // number of vertices in this digraph
    private int E;                      // number of edges in this digraph
    private ArrayList<DirectedEdge>[] adj;    // adj[v] = adjacency list for vertex v
    private int[] indegree;             // indegree[v] = indegree of vertex v
    
   
    public EdgeWeightedDigraph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices in a Digraph must be nonnegative");
        this.V = V;
        this.E = 0;
        this.indegree = new int[V];
        adj = (ArrayList<DirectedEdge>[]) new ArrayList[V];
        for (int v = 0; v < V; v++)
            adj[v] = new ArrayList<DirectedEdge>();
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        
        adj[v].add(e);
        E++;
    }
    
    public Iterable<DirectedEdge> adj(int v) {
        return adj[v];
    }

    public Iterable<DirectedEdge> edges() {
        ArrayList<DirectedEdge> list = new ArrayList<DirectedEdge>();
        for (int v = 0; v < V; v++) {
            for (DirectedEdge e : adj(v)) {
                list.add(e);
            }
        }
        return list;
    } 

}
