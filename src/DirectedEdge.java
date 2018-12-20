
public class DirectedEdge { 
    public final int v;
    public final int w;
    public final double weight;

    
    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

   
    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return v + "->" + w + " " + String.format("%5.2f", weight);
    }

}
