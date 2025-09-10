package org.example.ds.traverse.graph;

import java.util.Stack;

public class DFS {

    public void traverseGraph_dfs(int head) {
        Stack stack=new Stack<>();
        int adjancy_matrix[][] = {
                {0, 1, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
        };

        int []visited={0,0,0,0,0,0,0};
        visited[head]=1;
        stack.push(head);
        System.out.print(head+" ");

        while(!stack.isEmpty()){
            int node= (int) stack.pop();
            for(int i=0;i<7;i++){
                if(adjancy_matrix[node][i]==1 && visited[i]==0){
                    System.out.print(i+" ");
                    stack.push(i);
                    visited[i]=1;
                }
            }
        }





    }
}
