package org.example.ds.Krushals;

public class Edge implements Comparable<Edge>{

    int source=0;
    int destination=0;
    int weight=0;
    @Override
    public int compareTo(Edge compareEdge) {
        return this.weight-compareEdge.weight;
    }
}
