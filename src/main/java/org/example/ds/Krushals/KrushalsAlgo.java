package org.example.ds.Krushals;

import java.util.Arrays;
import java.util.Scanner;

public class KrushalsAlgo {

    public int getMinimumSpanningTree(){
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int v = sc.nextInt();
        Edge[] edges = new Edge[e];

        for (int i = 0; i < e; i++) {
            edges[i].source = sc.nextInt();
            edges[i].destination = sc.nextInt();
            edges[i].weight = sc.nextInt();
        }
        return krushals(edges, v, e);
    }

    private int krushals(Edge[] input_edges, int v, int e) {
        Arrays.sort(input_edges);
        Edge[] output_edges = new Edge[v - 1];
        int[] parent = new int[v];
        int k = 0;
        int sum = 0;
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < e; i++) {
            if (k == v - 1)
                break;
            Edge currEdge = input_edges[i];
            int src_parent = find(currEdge.source, parent);
            int dest_parent = find(currEdge.destination, parent);

            if (src_parent != dest_parent) {
                output_edges[k] = currEdge;
                k++;
                parent[src_parent] = dest_parent;
            }
        }
        for (int i = 0; i < v - 1; i++) {
            sum += output_edges[i].weight;
        }
        return sum;

    }

    public int find(int v, int[] parent) {
        if (parent[v] == v) {
            return v;
        }
        return find(parent[v], parent);

    }
}
