package org.example.ds.traverse.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void traverseGraph_bfs() {
        int adjancy_matrix[][] = {
                {0, 1, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
        };

        int visited[] = {0, 0, 0, 0, 0, 0, 0};
        int i = 5;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i]=1;
        System.out.print(i+" ");
        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int j=0;j<7;j++){
                if(adjancy_matrix[node][j]==1 && visited[j]==0){
                    queue.add(j);
                    visited[j]=1;
                    System.out.print(j+" ");
                }
            }
        }
    }
}
